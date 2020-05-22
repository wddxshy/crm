package com.shy.controller;

import com.shy.beans.CstCustomer;
import com.shy.service.CustomerService;
import com.shy.utils.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public String getCustomerList(Model model,Integer page,Integer pageSize,CstCustomer cstCustomer){
        PageBean customerListByPage = customerService.getCustomerListByPage(page,pageSize,cstCustomer);
        System.out.println(customerListByPage);
        model.addAttribute("customerListByPage",customerListByPage);
        return "customer/list";
    }

    @GetMapping("/customer/toEdit/{custId}")
    public ModelAndView findCustomerById(@PathVariable Long custId){
        CstCustomer cstCustomer = customerService.findCustomerById(custId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customer",cstCustomer);
        modelAndView.setViewName("customer/edit");
        return modelAndView;
    }

    @PostMapping("/customer/editsubmit")
    public String updateCustomer(CstCustomer cstCustomer){
        customerService.updateCustomerById(cstCustomer);
        return "redirect:/customer/list.x";
    }

    @RequestMapping("/customer/delete")
    public String deleteCustomerById(Long custId){
        customerService.deleteCustomerById(custId);
        return "redirect:/customer/list.x";
    }
}
