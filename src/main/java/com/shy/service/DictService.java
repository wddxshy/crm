package com.shy.service;

import com.shy.beans.BaseDict;

import java.util.List;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/17 16:50
 * @Description    数据字典接口
 */
public interface DictService {
    List<BaseDict> findDictsByTypeCode(String typeCode);
}
