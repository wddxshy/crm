package com.shy.mapper;

import com.shy.beans.CstCustomerDetail;
import com.shy.beans.CstCustomerDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstCustomerDetailMapper {
    long countByExample(CstCustomerDetailExample example);

    int deleteByExample(CstCustomerDetailExample example);

    int deleteByPrimaryKey(Long custId);

    int insert(CstCustomerDetail record);

    int insertSelective(CstCustomerDetail record);

    List<CstCustomerDetail> selectByExampleWithBLOBs(CstCustomerDetailExample example);

    List<CstCustomerDetail> selectByExample(CstCustomerDetailExample example);

    CstCustomerDetail selectByPrimaryKey(Long custId);

    int updateByExampleSelective(@Param("record") CstCustomerDetail record, @Param("example") CstCustomerDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") CstCustomerDetail record, @Param("example") CstCustomerDetailExample example);

    int updateByExample(@Param("record") CstCustomerDetail record, @Param("example") CstCustomerDetailExample example);

    int updateByPrimaryKeySelective(CstCustomerDetail record);

    int updateByPrimaryKeyWithBLOBs(CstCustomerDetail record);

    int updateByPrimaryKey(CstCustomerDetail record);
}