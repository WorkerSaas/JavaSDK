package com.workersaas.sdk.model.task.push;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>自动签约报名任务请求</h1>
 *
 * @author zhoul
 */
public class QueryAgreementRequest extends AbstractRequest<QueryAgreementResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "task/queryAgreement";
    }

    private Long taskId;

    private String idCard;

    public Long getTaskId() {
        return taskId;
    }

    public QueryAgreementRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public QueryAgreementRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
}
