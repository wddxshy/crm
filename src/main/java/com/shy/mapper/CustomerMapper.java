package com.shy.mapper;

import com.shy.beans.CstCustomer;
import com.shy.beans.CustomerCustom;

import java.util.List;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/19 19:19
 * @Description
 */
public interface CustomerMapper {
    List<CustomerCustom> findCustomerAndDict(CstCustomer cstCustomer);
}
