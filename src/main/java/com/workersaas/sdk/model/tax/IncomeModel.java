package com.workersaas.sdk.model.tax;

/**
 * <h1>收入模型</h1>
 * @author Hamm.cn
 */
public class IncomeModel {
    private Double submitBalance;
    private Double balance;
    private Double tax;
    private Double otherTax;
    private Double vatTax;
    private Double currentBalance;
    private Long incomeTime;
    private String realName;
    private String tradeNo;
    private String outerUserId;
    private String taxPlatformName;
    private String outerTradeNo;

    public Double getBalance() {
        return balance;
    }

    public Double getOtherTax() {
        return otherTax;
    }

    public Double getSubmitBalance() {
        return submitBalance;
    }

    public Double getTax() {
        return tax;
    }

    public Double getVatTax() {
        return vatTax;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public Long getIncomeTime() {
        return incomeTime;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public String getOuterUserId() {
        return outerUserId;
    }

    public String getRealName() {
        return realName;
    }

    public String getTaxPlatformName() {
        return taxPlatformName;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setOtherTax(Double otherTax) {
        this.otherTax = otherTax;
    }

    public void setSubmitBalance(Double submitBalance) {
        this.submitBalance = submitBalance;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public void setVatTax(Double vatTax) {
        this.vatTax = vatTax;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setIncomeTime(Long incomeTime) {
        this.incomeTime = incomeTime;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public void setOuterUserId(String outerUserId) {
        this.outerUserId = outerUserId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setTaxPlatformName(String taxPlatformName) {
        this.taxPlatformName = taxPlatformName;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
