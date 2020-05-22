package com.shy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shy.beans.CstCustomer;
import com.shy.beans.CstCustomerExample;
import com.shy.beans.CustomerCustom;
import com.shy.mapper.CstCustomerMapper;
import com.shy.mapper.CustomerMapper;
import com.shy.service.CustomerService;
import com.shy.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/17 18:48
 * @Description
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CstCustomerMapper cstCustomerMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public void insert(CstCustomer cstCustomer) {
        Random random = new Random();
        cstCustomer.setCustUserId(random.nextLong());
        cstCustomer.setCustCreateId(random.nextLong());
        cstCustomerMapper.insertSelective(cstCustomer);
    }

    @Override
    public PageBean getCustomerListByPage(Integer page, Integer pageSize, CstCustomer cstCustomer) {
        PageBean<List> customPageBean = new PageBean<>();
        customPageBean.setPage(page);
        customPageBean.setPageSize(pageSize);
        //设置分页对象
        PageHelper.startPage(customPageBean.getPage(), customPageBean.getPageSize());

        //执行分页查询
        List<CustomerCustom> list = customerMapper.findCustomerAndDict(cstCustomer);

        PageInfo<CustomerCustom> pageInfo = new PageInfo<>(list);
        customPageBean.setTotal(Math.toIntExact(pageInfo.getTotal()));
        customPageBean.setTotalPage(pageInfo.getPages());
        customPageBean.setData(list);


        return customPageBean;
    }

    @Override
    public CstCustomer findCustomerById(Long custId) {
        return cstCustomerMapper.selectByPrimaryKey(custId);
    }

    @Override
    public void updateCustomerById(CstCustomer cstCustomer) {
        cstCustomerMapper.updateByPrimaryKeySelective(cstCustomer);
    }

    @Override
    public void deleteCustomerById(Long custId) {
        cstCustomerMapper.deleteByPrimaryKey(custId);
    }

    @Override
    public void deleteBatch(List<Long> ids) {
        CstCustomerExample customerExample = new CstCustomerExample();
        customerExample.createCriteria().andCustCreateIdIn(ids);
        cstCustomerMapper.deleteByExample(customerExample);
    }
}
