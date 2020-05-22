package com.shy.controller;

import com.shy.beans.CstCustomer;
import com.shy.service.CustomerService;
import com.shy.utils.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/17 18:42
 * @Description
 */
@Controller
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/customer/insert")
    public String addCustomer(CstCustomer cstCustomer){
        System.out.println(cstCustomer);
        customerService.insert(cstCustomer);
        return "customer/list";
    }

    @RequestMapping("/customer/list")
    public String getCustomerList(Model model,Integer page,Integer pageSize){
        PageBean customerListByPage = customerService.getCustomerListByPage(page,pageSize);
        System.out.println(customerListByPage);
        model.addAttribute("customerListByPage",customerListByPage);
        return "customer/list";
    }
}

