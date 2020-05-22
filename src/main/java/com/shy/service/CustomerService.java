package com.shy.service;

import com.shy.beans.CstCustomer;
import com.shy.utils.PageBean;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/17 18:45
 * @Description
 */
public interface CustomerService {
    void insert(CstCustomer cstCustomer);

    PageBean getCustomerListByPage(Integer page,Integer pageSize);
}
