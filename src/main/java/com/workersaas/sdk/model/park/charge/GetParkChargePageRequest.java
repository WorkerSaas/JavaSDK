package com.workersaas.sdk.model.park.charge;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>查询充值分页列表</h1>
 *
 * @author Hamm.cn
 */
public class GetParkChargePageRequest extends AbstractRequest<GetParkChargePageResponse> {

    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "park/getParkChargeList";
    }
}
