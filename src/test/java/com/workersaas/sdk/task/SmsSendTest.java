package com.workersaas.sdk.task;

import com.workersaas.sdk.Config;
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

    public static void main(String[] args) {
        TaskSignJoinSmsRequest request = new TaskSignJoinSmsRequest();
        request.setTaskId(1L);
        request.setPhones("17803879893");
        TaskSignJoinSmsResponse request1 = Config.CLIENT.request(request);
        log.info(request1);
    }

}
