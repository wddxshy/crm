package com.shy.controller;

import com.shy.beans.BaseDict;
import com.shy.service.DictService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/17 16:41
 * @Description
 */
@Controller
public class DictController {

    @Resource
    private DictService dictService;

    @RequestMapping("/dict/typecode/{typeCode}")
    @ResponseBody
    public List<BaseDict> findDictsByTypeCode(@PathVariable String typeCode){
        return dictService.findDictsByTypeCode(typeCode);
    }

}
