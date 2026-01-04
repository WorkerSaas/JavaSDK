package com.workersaas.sdk.model.park.order;

import com.workersaas.sdk.common.base.AbstractRequest;
import com.workersaas.sdk.model.order.OrderModel;

/**
 * <h1>查询订单分页列表</h1>
 *
 * @author Hamm.cn
 */
public class GetParkOrderPageRequest extends AbstractRequest<GetParkOrderPageResponse> {
    private OrderModel filter;

    public void setFilter(OrderModel filter) {
        this.filter = filter;
    }

    public OrderModel getFilter() {
        return filter;
    }

    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "order/getParkOrderList";
    }
}
