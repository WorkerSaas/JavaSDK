package com.workersaas.sdk.model.task.push;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>自动签约报名任务请求</h1>
 *
 * @author zhoul
 */
public class TaskValidHeshunRequest extends AbstractRequest<TaskValidHeshunResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "task/validIdCardImage";
    }

    private Long taskId;

    private String realName;

    private String idCard;

    private String phone;

    private String faceImage;

    private String idCardFrontImage;
    private String idCardBackImage;

    public Long getTaskId() {
        return taskId;
    }

    public TaskValidHeshunRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public TaskValidHeshunRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public TaskValidHeshunRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TaskValidHeshunRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public TaskValidHeshunRequest setFaceImage(String faceImage) {
        this.faceImage = faceImage;
        return this;
    }

    public TaskValidHeshunRequest setIdCardBackImage(String idCardBackImage) {
        this.idCardBackImage = idCardBackImage;
        return this;
    }

    public String getIdCardBackImage() {
        return idCardBackImage;
    }

    public TaskValidHeshunRequest setIdCardFrontImage(String idCardFrontImage) {
        this.idCardFrontImage = idCardFrontImage;
        return this;
    }

    public String getIdCardFrontImage() {
        return idCardFrontImage;
    }
}
