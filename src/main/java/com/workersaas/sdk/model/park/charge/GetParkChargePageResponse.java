package com.workersaas.sdk.model.park.charge;

import com.workersaas.sdk.common.base.AbstractResponse;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.common.Page;
import com.workersaas.sdk.model.order.OrderModel;

import java.util.List;

/**
 * <h1>查询发放订单响应模型</h1>
 *
 * @author Hamm.cn
 */
public class GetParkChargePageResponse extends AbstractResponse<GetParkChargePageResponse> {
    private Integer total;
    private Integer pageCount;
    private List<ChargeVo> list;
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

    public List<ChargeVo> getList() {
        return list;
    }

    public void setList(List<ChargeVo> list) {
        this.list = list;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public GetParkChargePageResponse parseData(String data) {
        return Json.parse(data, GetParkChargePageResponse.class);
    }
}
