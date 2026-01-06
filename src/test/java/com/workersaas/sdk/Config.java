package com.workersaas.sdk;

import com.workersaas.sdk.common.base.WorkerSaasClient;
import com.workersaas.sdk.common.base.WorkerSaasConfig;
import com.workersaas.sdk.common.base.WorkerSaasConstant;
import com.workersaas.sdk.common.enums.WorkerSaasArithmetic;

public class Config {
    // 生产辽宁理账狮
//    public static final String APP_KEY = "ANp7Mhm4XzpSv8wH5JHgApAN0g8vWBcL";
//    public static final String APP_SECRET = "ol87UF7IC7a7xvDqYZ2yW449kYiMLnfJYVJubVnPd50=";

    // 广州璇玑
    public static final String APP_KEY = "mDRJnMRYUd1ZHshLKLAIrGrvrhZy13Ik";
    public static final String APP_SECRET = "xbuaXZFsNthQkqMBcUZ8DvY+EkcwW3dlLJNt4Va0sts=";


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
