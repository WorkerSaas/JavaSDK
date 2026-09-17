package com.workersaas.sdk.model.tax.querycome;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>请求模型</h1>
 *
 * @author Hamm.cn
 */
public class TaxQueryIncomeRequest extends AbstractRequest<TaxQueryIncomeResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "tax/queryIncome";
    }

    /**
     * 流水号
     */
    private String outerTradeNo;

    public TaxQueryIncomeRequest setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
        return this;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }
}