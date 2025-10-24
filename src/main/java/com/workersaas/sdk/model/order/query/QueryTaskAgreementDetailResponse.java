package com.workersaas.sdk.model.order.query;

import com.workersaas.sdk.common.base.AbstractResponse;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.order.QueryTaskAgreementDetailModel;

/**
 * com.workersaas.sdk.model.order.query
 *
 * @author bing
 * 2025/10/24
 */
public class QueryTaskAgreementDetailResponse extends AbstractResponse<QueryTaskAgreementDetailResponse> {

    private QueryTaskAgreementDetailModel queryTaskAgreementDetail;

    @Override
    public QueryTaskAgreementDetailResponse parseData(String data) {
        return this.setQueryTaskAgreementDetail(Json.parse(data, QueryTaskAgreementDetailModel.class));
    }

    public QueryTaskAgreementDetailModel getQueryTaskAgreementDetail() {
        return queryTaskAgreementDetail;
    }

    public QueryTaskAgreementDetailResponse setQueryTaskAgreementDetail(QueryTaskAgreementDetailModel queryTaskAgreementDetail) {
        this.queryTaskAgreementDetail = queryTaskAgreementDetail;
        return this;
    }
}
