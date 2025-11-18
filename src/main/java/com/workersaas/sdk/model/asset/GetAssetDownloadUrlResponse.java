package com.workersaas.sdk.model.asset;

import com.workersaas.sdk.common.base.AbstractResponse;
import com.workersaas.sdk.common.base.Json;

/**
 * <h1>查询附件下载地址响应模型</h1>
 *
 * @author Hamm.cn
 */
public class GetAssetDownloadUrlResponse extends AbstractResponse<GetAssetDownloadUrlResponse> {
    /**
     * 附件模型
     */
    private AssetModel asset;

    /**
     * 解析数据
     *
     * @param data 解密后的data数据
     */
    @Override
    public GetAssetDownloadUrlResponse parseData(String data) {
        return this.setAsset(Json.parse(data, AssetModel.class));
    }

    /**
     * 获取附件模型
     *
     * @return 订单模型
     */
    public AssetModel getAsset() {
        return asset;
    }

    /**
     * 设置附件模型
     *
     * @param asset 附件模型
     * @return 当前实例
     */
    public GetAssetDownloadUrlResponse setAsset(AssetModel asset) {
        this.asset = asset;
        return this;
    }
}
