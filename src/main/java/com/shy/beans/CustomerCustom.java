package com.shy.beans;

import java.util.List;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/19 19:16
 * @Description
 */
public class CustomerCustom extends CstCustomer {
    private List<BaseDict> dicts;

    public List<BaseDict> getDicts() {
        return dicts;
    }

    public void setDicts(List<BaseDict> dicts) {
        this.dicts = dicts;
    }
}
