package com.shy.service.impl;

import com.shy.beans.BaseDict;
import com.shy.beans.BaseDictExample;
import com.shy.mapper.BaseDictMapper;
import com.shy.service.DictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/17 16:52
 * @Description
 */
@Service
public class DictServiceImpl implements DictService {

    @Resource
    private BaseDictMapper baseDictMapper;

    public List<BaseDict> findDictsByTypeCode(String typeCode) {
        BaseDictExample example = new BaseDictExample();
        BaseDictExample.Criteria criteria = example.createCriteria();
        criteria.andDicttypecodeEqualTo(typeCode);
        List<BaseDict> baseDictList = baseDictMapper.selectByExample(example);
        baseDictList.forEach(System.out::println);
        return baseDictList;
    }
}
