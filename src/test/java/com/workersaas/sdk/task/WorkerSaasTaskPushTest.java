package com.workersaas.sdk.task;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.task.push.TaskPushRequest;
import com.workersaas.sdk.model.task.push.TaskPushResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <h1>任务测试</h1>
 */
public class WorkerSaasTaskPushTest {
    /**
     * 日志
     */
    private static final Log log = LogFactory.getLog(WorkerSaasTaskPushTest.class);

    public static void main(String[] args) {
        TaskPushRequest request = new TaskPushRequest()
                .setTaskId(5L)
                .setIdCard("500240199110030157")
                .setRealName("马建")
                .setPhone("18523749565");
        log.info(String.format("报名任务参数: %s", Json.toString(request)));
        TaskPushResponse response = Config.CLIENT.request(request);
        log.info(String.format("报名任务返回: %s", Json.toString(response)));
    }

}
