package com.workersaas.sdk.model.task.push;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>自动签约报名任务请求</h1>
 *
 * @author zhoul
 */
public class TaskPushV2Request extends AbstractRequest<TaskPushV2Response> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "task/push/v2";
    }

    private Long taskId;

    private String realName;

    private String idCard;

    private String phone;

    private String faceImage;

    private String idCardFrontImage;
    private String idCardBackImage;

    private String payAccount;

    public Long getTaskId() {
        return taskId;
    }

    public TaskPushV2Request setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public TaskPushV2Request setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public TaskPushV2Request setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TaskPushV2Request setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public TaskPushV2Request setFaceImage(String faceImage) {
        this.faceImage = faceImage;
        return this;
    }

    public TaskPushV2Request setPayAccount(String payAccount) {
        this.payAccount = payAccount;
        return this;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public TaskPushV2Request setIdCardBackImage(String idCardBackImage) {
        this.idCardBackImage = idCardBackImage;
        return this;
    }

    public String getIdCardBackImage() {
        return idCardBackImage;
    }

    public TaskPushV2Request setIdCardFrontImage(String idCardFrontImage) {
        this.idCardFrontImage = idCardFrontImage;
        return this;
    }

    public String getIdCardFrontImage() {
        return idCardFrontImage;
    }
}
