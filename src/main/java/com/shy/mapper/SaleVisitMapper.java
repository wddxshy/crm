package com.shy.mapper;

import com.shy.beans.SaleVisit;
import com.shy.beans.SaleVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleVisitMapper {
    long countByExample(SaleVisitExample example);

    int deleteByExample(SaleVisitExample example);

    int deleteByPrimaryKey(String visitId);

    int insert(SaleVisit record);

    int insertSelective(SaleVisit record);

    List<SaleVisit> selectByExample(SaleVisitExample example);

    SaleVisit selectByPrimaryKey(String visitId);

    int updateByExampleSelective(@Param("record") SaleVisit record, @Param("example") SaleVisitExample example);

    int updateByExample(@Param("record") SaleVisit record, @Param("example") SaleVisitExample example);

    int updateByPrimaryKeySelective(SaleVisit record);

    int updateByPrimaryKey(SaleVisit record);
}