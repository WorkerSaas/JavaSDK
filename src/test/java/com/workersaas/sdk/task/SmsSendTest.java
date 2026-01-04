package com.workersaas.sdk.task;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.WorkerSaasClient;
import com.workersaas.sdk.common.base.WorkerSaasConfig;
import com.workersaas.sdk.common.enums.WorkerSaasArithmetic;
import com.workersaas.sdk.model.task.smsSend.TaskSignJoinSmsRequest;
import com.workersaas.sdk.model.task.smsSend.TaskSignJoinSmsResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author bing
 * 2025/12/26
 */
public class SmsSendTest {

    /**
     * 日志
     */
    private static final Log log = LogFactory.getLog(SmsSendTest.class);

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
        TaskSignJoinSmsRequest request = new TaskSignJoinSmsRequest();
        request.setTaskId(1L);
        request.setPhones("17803879893");
        TaskSignJoinSmsResponse request1 = CLIENT.request(request);
        log.info(request1);
    }

}
