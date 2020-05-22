package com.shy.beans;

public class CstCustomerDetail {
    private Long custId;

    private String custRegion;

    private String custZip;

    private String custAddress;

    private String custFax;

    private String custWebsite;

    private String custLicence;

    private String custCorporation;

    private Long custCapital;

    private String custBank;

    private String custPic;

    private String custMemo;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustRegion() {
        return custRegion;
    }

    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion == null ? null : custRegion.trim();
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip == null ? null : custZip.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax == null ? null : custFax.trim();
    }

    public String getCustWebsite() {
        return custWebsite;
    }

    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite == null ? null : custWebsite.trim();
    }

    public String getCustLicence() {
        return custLicence;
    }

    public void setCustLicence(String custLicence) {
        this.custLicence = custLicence == null ? null : custLicence.trim();
    }

    public String getCustCorporation() {
        return custCorporation;
    }

    public void setCustCorporation(String custCorporation) {
        this.custCorporation = custCorporation == null ? null : custCorporation.trim();
    }

    public Long getCustCapital() {
        return custCapital;
    }

    public void setCustCapital(Long custCapital) {
        this.custCapital = custCapital;
    }

    public String getCustBank() {
        return custBank;
    }

    public void setCustBank(String custBank) {
        this.custBank = custBank == null ? null : custBank.trim();
    }

    public String getCustPic() {
        return custPic;
    }

    public void setCustPic(String custPic) {
        this.custPic = custPic == null ? null : custPic.trim();
    }

    public String getCustMemo() {
        return custMemo;
    }

    public void setCustMemo(String custMemo) {
        this.custMemo = custMemo == null ? null : custMemo.trim();
    }
}