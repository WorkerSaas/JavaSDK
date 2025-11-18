package com.workersaas.sdk.asset.order;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.common.base.WorkerSaasClient;
import com.workersaas.sdk.common.base.WorkerSaasConfig;
import com.workersaas.sdk.common.enums.WorkerSaasArithmetic;
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

    /**
     * WorkerSaas客户端
     */
    private static final WorkerSaasClient CLIENT;

    static {
        WorkerSaasConfig workerSaasConfig = WorkerSaasConfig.create()
                .setAppKey(Config.APP_KEY)
                .setAppSecret(Config.APP_SECRET)
                .setGateway(Config.GATEWAY)
                .setArithmetic(WorkerSaasArithmetic.AES);
        CLIENT = WorkerSaasClient.create(workerSaasConfig);
    }

    public static void main(String[] args) {
        getDownloadUrl();
    }

    private static void getDownloadUrl() {
        GetAssetDownloadUrlRequest request = new GetAssetDownloadUrlRequest()
                .setUrl("agreement/1763460597476_logo_副本.png");
        log.info(String.format("查询请求数据: %s", Json.toString(request)));
        GetAssetDownloadUrlResponse response = CLIENT.request(request);
        log.info(String.format("查询响应数据: %s", response.getAsset().getUrl()));
    }
}
