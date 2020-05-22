package com.shy.beans;

public class BaseDict {
    private String dictid;

    private String dicttypecode;

    private String dicttypename;

    private String dictitemname;

    private String dictitemcode;

    private Integer dictsort;

    private String dictenable;

    private String dictmemo;

    @Override
    public String toString() {
        return "BaseDict{" +
                "dictid='" + dictid + '\'' +
                ", dicttypecode='" + dicttypecode + '\'' +
                ", dicttypename='" + dicttypename + '\'' +
                ", dictitemname='" + dictitemname + '\'' +
                ", dictitemcode='" + dictitemcode + '\'' +
                ", dictsort=" + dictsort +
                ", dictenable='" + dictenable + '\'' +
                ", dictmemo='" + dictmemo + '\'' +
                '}';
    }

    public String getDictid() {
        return dictid;
    }

    public void setDictid(String dictid) {
        this.dictid = dictid == null ? null : dictid.trim();
    }

    public String getDicttypecode() {
        return dicttypecode;
    }

    public void setDicttypecode(String dicttypecode) {
        this.dicttypecode = dicttypecode == null ? null : dicttypecode.trim();
    }

    public String getDicttypename() {
        return dicttypename;
    }

    public void setDicttypename(String dicttypename) {
        this.dicttypename = dicttypename == null ? null : dicttypename.trim();
    }

    public String getDictitemname() {
        return dictitemname;
    }

    public void setDictitemname(String dictitemname) {
        this.dictitemname = dictitemname == null ? null : dictitemname.trim();
    }

    public String getDictitemcode() {
        return dictitemcode;
    }

    public void setDictitemcode(String dictitemcode) {
        this.dictitemcode = dictitemcode == null ? null : dictitemcode.trim();
    }

    public Integer getDictsort() {
        return dictsort;
    }

    public void setDictsort(Integer dictsort) {
        this.dictsort = dictsort;
    }

    public String getDictenable() {
        return dictenable;
    }

    public void setDictenable(String dictenable) {
        this.dictenable = dictenable == null ? null : dictenable.trim();
    }

    public String getDictmemo() {
        return dictmemo;
    }

    public void setDictmemo(String dictmemo) {
        this.dictmemo = dictmemo == null ? null : dictmemo.trim();
    }
}