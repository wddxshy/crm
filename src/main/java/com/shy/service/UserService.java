package com.shy.service;

import com.shy.beans.SysUser;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/13 13:23
 * @Description
 */
public interface UserService {
    void addUser(SysUser sysUser);

    String findUserByCode(String userCode);

    SysUser findUserByCodeAndPassword(SysUser sysUser);

    void updateUserPassword(SysUser sysUser);
}
