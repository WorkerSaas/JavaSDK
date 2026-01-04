package com.workersaas.sdk.asset.order;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.asset.GetAssetDownloadUrlRequest;
import com.workersaas.sdk.model.asset.GetAssetDownloadUrlResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <h1>附件测试</h1>
 *
 * @author zhoul
 */
public class WorkerSaasAssetTest {

    /**
     * 日志
     */
    private static final Log log = LogFactory.getLog(WorkerSaasAssetTest.class);

    public static void main(String[] args) {
        getDownloadUrl();
    }

    private static void getDownloadUrl() {
        GetAssetDownloadUrlRequest request = new GetAssetDownloadUrlRequest()
                .setUrl("/agreement/push/ewogICAgImlkQ2FyZCI6ICIzNzAyODUyMDA0MDMxMTQxNDciLAogICAgImNvbSI6IDMKfQ==");
        log.info(String.format("查询请求数据: %s", Json.toString(request)));
        GetAssetDownloadUrlResponse response = Config.CLIENT.request(request);
        log.info(String.format("查询响应数据: %s", response.getAsset().getUrl()));
    }
}
