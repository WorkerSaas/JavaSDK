package com.workersaas.sdk.model.tax.pushincome;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>请求模型</h1>
 *
 * @author Hamm.cn
 */
public class TaxPushIncomeRequest extends AbstractRequest<TaxPushIncomeResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "tax/pushIncome";
    }

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 用户收入的时间
     */
    private Long incomeTime;

    /**
     * 证件号
     */
    private String idCard;

    /**
     * 客户侧唯一用户ID
     */
    private String outerUserId;

    /**
     * 互联网平台备案名称
     */
    private String taxPlatformName;

    /**
     * 商户唯一流水号
     */
    private String outerTradeNo;

    /**
     * 操作金额
     */
    private Double submitBalance;

    /**
     * 证件号
     *
     * @return 证件号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置证件号
     *
     * @param idCard 证件号
     * @return 当前实例
     */
    public TaxPushIncomeRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    /**
     * 操作金额
     *
     * @return 操作金额
     */
    public Double getSubmitBalance() {
        return submitBalance;
    }

    /**
     * 设置操作金额
     *
     * @param submitBalance 操作金额
     * @return 当前实例
     */
    public TaxPushIncomeRequest setSubmitBalance(Double submitBalance) {
        this.submitBalance = submitBalance;
        return this;
    }

    /**
     * 任务ID
     *
     * @return 任务ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 设置任务ID
     *
     * @param taskId 任务ID
     * @return 当前实例
     */
    public TaxPushIncomeRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 设置用户收入的时间
     *
     * @param incomeTime 用户收入的时间
     * @return 当前实例
     */
    public TaxPushIncomeRequest setIncomeTime(Long incomeTime) {
        this.incomeTime = incomeTime;
        return this;
    }

    /**
     * 用户收入的时间
     *
     * @return 用户收入的时间
     */
    public Long getIncomeTime() {
        return incomeTime;
    }

    /**
     * 客户侧唯一用户ID
     *
     * @return 客户侧唯一用户ID
     */
    public String getOuterUserId() {
        return outerUserId;
    }
    /**
     * 设置客户侧唯一用户ID
     *
     * @param outerUserId 客户侧唯一用户ID
     * @return 当前实例
     */
    public TaxPushIncomeRequest setOuterUserId(String outerUserId) {
        this.outerUserId = outerUserId;
        return this;
    }

    /**
     * 互联网平台备案名称
     *
     * @return 互联网平台备案名称
     */
    public String getTaxPlatformName() {
        return taxPlatformName;
    }
    /**
     * 设置互联网平台备案名称
     *
     * @param taxPlatformName 互联网平台备案名称
     * @return 当前实例
     */
    public TaxPushIncomeRequest setTaxPlatformName(String taxPlatformName) {
        this.taxPlatformName = taxPlatformName;
        return this;
    }

    /**
     * 商户唯一流水号
     *
     * @return 商户唯一流水号
     */
    public String getOuterTradeNo() {
        return outerTradeNo;
    }
    /**
     * 设置商户唯一流水号
     *
     * @param outerTradeNo 商户唯一流水号
     * @return 当前实例
     */
    public TaxPushIncomeRequest setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
        return this;
    }
}