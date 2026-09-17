package com.workersaas.sdk.model.tax.calcprepush;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>请求模型</h1>
 *
 * @author Hamm.cn
 */
public class TaxCalcPrePushIncomeRequest extends AbstractRequest<TaxCalcPrePushIncomeResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "tax/calcPrePushIncome";
    }

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 证件号
     */
    private String idCard;

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
    public TaxCalcPrePushIncomeRequest setIdCard(String idCard) {
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
    public TaxCalcPrePushIncomeRequest setSubmitBalance(Double submitBalance) {
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
    public TaxCalcPrePushIncomeRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
}

