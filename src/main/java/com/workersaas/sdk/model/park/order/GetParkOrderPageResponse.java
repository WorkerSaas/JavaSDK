package com.workersaas.sdk.model.park.order;

import com.workersaas.sdk.common.base.AbstractResponse;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.common.Page;
import com.workersaas.sdk.model.order.OrderModel;
import com.workersaas.sdk.model.park.charge.ChargeVo;

import java.util.List;

/**
 * <h1>查询发放订单响应模型</h1>
 *
 * @author Hamm.cn
 */
public class GetParkOrderPageResponse extends AbstractResponse<GetParkOrderPageResponse> {
    private Integer total;
    private Integer pageCount;
    private List<OrderModel> list;
    private Page page;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<OrderModel> getList() {
        return list;
    }

    public void setList(List<OrderModel> list) {
        this.list = list;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public GetParkOrderPageResponse parseData(String data) {
        return Json.parse(data, GetParkOrderPageResponse.class);
    }
}
