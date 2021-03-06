package com.shy.mapper;

import com.shy.beans.CstLinkman;
import com.shy.beans.CstLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstLinkmanMapper {
    long countByExample(CstLinkmanExample example);

    int deleteByExample(CstLinkmanExample example);

    int deleteByPrimaryKey(Long lkmId);

    int insert(CstLinkman record);

    int insertSelective(CstLinkman record);

    List<CstLinkman> selectByExample(CstLinkmanExample example);

    CstLinkman selectByPrimaryKey(Long lkmId);

    int updateByExampleSelective(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    int updateByExample(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    int updateByPrimaryKeySelective(CstLinkman record);

    int updateByPrimaryKey(CstLinkman record);
}