package com.workersaas.sdk.model.task.smsSend;

import com.workersaas.sdk.common.base.AbstractRequest;
import com.workersaas.sdk.model.task.push.TaskPushResponse;

/**
 *
 * @author bing
 * 2025/12/26
 */
public class TaskSignJoinSmsRequest extends AbstractRequest<TaskSignJoinSmsResponse> {
    @Override
    protected String getApiUrl() {
        return "task/sendTaskSignJoinSms";
    }

    private Long taskId;

    private String phones;


    public String getPhones() {
        return phones;
    }

    public TaskSignJoinSmsRequest setPhones(String phones) {
        this.phones = phones;
        return this;
    }

    public Long getTaskId() {
        return taskId;
    }

    public TaskSignJoinSmsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
}
