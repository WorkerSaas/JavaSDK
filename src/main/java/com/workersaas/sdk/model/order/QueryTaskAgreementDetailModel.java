package com.workersaas.sdk.model.order;

import java.util.ArrayList;
import java.util.List;

/**
 * com.workersaas.sdk.model.order
 *
 * @author gab98
 * 2025/10/24
 */
public class QueryTaskAgreementDetailModel {
    /**
     * 系统流水号
     */
    private String tradeNo;

    /**
     * 名称
     */
    private String taskName;

    /**
     * 项目
     */
    private String project;

    /**
     * 描述
     */
    private String remark;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 地址
     */
    private String address;

    /**
     * 人脸文件
     */
    private String faceFileUrl;

    /**
     * 身份反面文件
     */
    private String backFileUrl;

    /**
     * 身份正面文件
     */
    private String frontFileUrl;

    public String getRealName() {
        return realName;
    }

    public QueryTaskAgreementDetailModel setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public QueryTaskAgreementDetailModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public QueryTaskAgreementDetailModel setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public QueryTaskAgreementDetailModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFaceFileUrl() {
        return faceFileUrl;
    }

    public QueryTaskAgreementDetailModel setFaceFileUrl(String faceFileUrl) {
        this.faceFileUrl = faceFileUrl;
        return this;
    }

    public String getBackFileUrl() {
        return backFileUrl;
    }

    public QueryTaskAgreementDetailModel setBackFileUrl(String backFileUrl) {
        this.backFileUrl = backFileUrl;
        return this;
    }

    public String getFrontFileUrl() {
        return frontFileUrl;
    }

    public QueryTaskAgreementDetailModel setFrontFileUrl(String frontFileUrl) {
        this.frontFileUrl = frontFileUrl;
        return this;
    }



    public String getTradeNo() {
        return tradeNo;
    }

    public QueryTaskAgreementDetailModel setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }

    public String getTaskName() {
        return taskName;
    }

    public QueryTaskAgreementDetailModel setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public QueryTaskAgreementDetailModel setProject(String project) {
        this.project = project;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public QueryTaskAgreementDetailModel setRemark(String remark) {
        this.remark = remark;
        return this;
    }

}
