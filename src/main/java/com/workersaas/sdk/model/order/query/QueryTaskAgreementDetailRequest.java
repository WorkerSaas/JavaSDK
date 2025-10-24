package com.workersaas.sdk.model.order.query;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * com.workersaas.sdk.model.order.query
 *
 * @author bing
 * 2025/10/24
 */
public class QueryTaskAgreementDetailRequest extends AbstractRequest<QueryTaskAgreementDetailResponse> {


    /**
     * API地址
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "order/getTaskAgreementDetail";
    }

    /**
     * 系统流水号
     */
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public QueryTaskAgreementDetailRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
}
