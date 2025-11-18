package com.workersaas.sdk.model.park.order;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>查询发放订单详情</h1>
 *
 * @author Hamm.cn
 */
public class GetParkOrderDetailRequest extends AbstractRequest<GetParkOrderDetailResponse> {

    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "order/getParkOrderDetail";
    }

    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 订单号
     * @param tradeNo 订单号
     * @return 当前实例
     */
    public GetParkOrderDetailRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
}
