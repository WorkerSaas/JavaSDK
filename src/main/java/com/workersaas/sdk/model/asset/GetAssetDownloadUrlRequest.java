package com.workersaas.sdk.model.asset;

import com.workersaas.sdk.common.base.AbstractRequest;

/**
 * <h1>查询附件下载地址</h1>
 *
 * @author Hamm.cn
 */
public class GetAssetDownloadUrlRequest extends AbstractRequest<GetAssetDownloadUrlResponse> {
    /**
     * API地址
     *
     * @return API地址
     */
    @Override
    protected String getApiUrl() {
        return "asset/getDownloadUrl";
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public GetAssetDownloadUrlRequest setUrl(String url) {
        this.url = url;
        return this;
    }
}

