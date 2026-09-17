package com.workersaas.sdk.model.tax.confirmincome;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>请求模型</h1>
 *
 * @author Hamm.cn
 */
public class TaxConfirmIncomeRequest extends AbstractRequest<TaxConfirmIncomeResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "tax/confirmIncome";
    }

    /**
     * 流水号
     */
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public TaxConfirmIncomeRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
}