package com.workersaas.sdk.model.park.charge;

import com.workersaas.sdk.model.enterprise.park.EnterpriseParkModel;

/**
 * <h1>充值 VO</h1>
 *
 * @author Hamm.cn
 */
public class ChargeVo {
    private Long id;
    private Double balance;
    private String tradeNumber;
    private String bankAccount;
    private String bankAccountTo;
    private Long inputTime;
    private EnterpriseParkModel enterprisePark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankAccountTo() {
        return bankAccountTo;
    }

    public void setBankAccountTo(String bankAccountTo) {
        this.bankAccountTo = bankAccountTo;
    }

    public Long getInputTime() {
        return inputTime;
    }

    public void setInputTime(Long inputTime) {
        this.inputTime = inputTime;
    }

    public EnterpriseParkModel getEnterprisePark() {
        return enterprisePark;
    }

    public void setEnterprisePark(EnterpriseParkModel enterprisePark) {
        this.enterprisePark = enterprisePark;
    }
}
