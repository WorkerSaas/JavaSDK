package com.workersaas.sdk.model.task.upload;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>上传签约文件请求</h1>
 *
 * @author zhoul
 */
public class TaskUploadSignFileRequest extends AbstractRequest<TaskUploadSignFileResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "task/uploadSignFile";
    }

    private Long taskId;

    private String idCard;

    /**
     * 签约合同文件
     */
    private String signFileUrl;

    /**
     * 人脸照片
     */
    private String faceFileUrl;

    /**
     * 身份证正面照片
     */
    private String idCardFrontFileUrl;

    /**
     * 身份证反面照片
     */
    private String idCardBackFileUrl;

    public Long getTaskId() {
        return taskId;
    }

    public TaskUploadSignFileRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public TaskUploadSignFileRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getSignFileUrl() {
        return signFileUrl;
    }

    public TaskUploadSignFileRequest setSignFileUrl(String signFileUrl) {
        this.signFileUrl = signFileUrl;
        return this;
    }

    public String getFaceFileUrl() {
        return faceFileUrl;
    }

    public TaskUploadSignFileRequest setFaceFileUrl(String faceFileUrl) {
        this.faceFileUrl = faceFileUrl;
        return this;
    }

    public String getIdCardFrontFileUrl() {
        return idCardFrontFileUrl;
    }

    public TaskUploadSignFileRequest setIdCardFrontFileUrl(String idCardFrontFileUrl) {
        this.idCardFrontFileUrl = idCardFrontFileUrl;
        return this;
    }

    public String getIdCardBackFileUrl() {
        return idCardBackFileUrl;
    }

    public TaskUploadSignFileRequest setIdCardBackFileUrl(String idCardBackFileUrl) {
        this.idCardBackFileUrl = idCardBackFileUrl;
        return this;
    }



}
