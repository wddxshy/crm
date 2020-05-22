package com.shy.service.impl;

import com.shy.beans.SysUser;
import com.shy.beans.SysUserExample;
import com.shy.mapper.SysUserMapper;
import com.shy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/13 13:25
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SysUserMapper sysUserMapper;

    public void addUser(SysUser sysUser) {
        sysUser.setUserState("1");
        sysUserMapper.insert(sysUser);
    }

    public String findUserByCode(String userCode) {
        System.out.println(userCode);
        //创建查询条件的属性对象
        SysUserExample example = new SysUserExample();
        //创建查询条件的规则对象
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(userCode);
        List<SysUser> list = sysUserMapper.selectByExample(example);
        System.out.println(list.size());
        if (list.size() > 0) {
            return "0";
        }
        return "1";
    }

    public SysUser findUserByCodeAndPassword(SysUser sysUser) {
        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserCodeEqualTo(sysUser.getUserCode());
        List<SysUser> list = sysUserMapper.selectByExample(userExample);
        if (list != null && list.size() > 0){
            SysUser user = list.get(0);
            if (user.getUserPassword().equals(sysUser.getUserPassword())){
                return user;
            }
            return null;
        }
        return null;
    }

    public void updateUserPassword(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }
}
