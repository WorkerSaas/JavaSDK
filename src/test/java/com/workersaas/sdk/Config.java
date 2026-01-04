package com.workersaas.sdk;

import com.workersaas.sdk.common.base.WorkerSaasClient;
import com.workersaas.sdk.common.base.WorkerSaasConfig;
import com.workersaas.sdk.common.base.WorkerSaasConstant;
import com.workersaas.sdk.common.enums.WorkerSaasArithmetic;

public class Config {
    public static final String APP_KEY = "";
    public static final String APP_SECRET = "";

    public static final String GATEWAY = WorkerSaasConstant.GATEWAY_PRODUCTION;

    /**
     * WorkerSaas 客户端
     */
    public static final WorkerSaasClient CLIENT;

    static {
        WorkerSaasConfig workerSaasConfig = WorkerSaasConfig.create()
                .setAppKey(APP_KEY)
                .setAppSecret(APP_SECRET)
                .setGateway(GATEWAY)
                .setArithmetic(WorkerSaasArithmetic.AES);
        CLIENT = WorkerSaasClient.create(workerSaasConfig);
    }
}
