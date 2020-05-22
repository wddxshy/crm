package com.shy.mapper;

import com.shy.beans.BaseDict;
import com.shy.beans.BaseDictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDictMapper {
    long countByExample(BaseDictExample example);

    int deleteByExample(BaseDictExample example);

    int deleteByPrimaryKey(String dictid);

    int insert(BaseDict record);

    int insertSelective(BaseDict record);

    List<BaseDict> selectByExample(BaseDictExample example);

    BaseDict selectByPrimaryKey(String dictid);

    int updateByExampleSelective(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    int updateByExample(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    int updateByPrimaryKeySelective(BaseDict record);

    int updateByPrimaryKey(BaseDict record);
}