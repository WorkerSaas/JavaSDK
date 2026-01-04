package com.workersaas.sdk.park;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.park.enterprise.ParkEnterpriseModel;
import com.workersaas.sdk.model.park.enterprise.list.ParkEnterpriseGetListRequest;
import com.workersaas.sdk.model.park.enterprise.list.ParkEnterpriseGetListResponse;
import com.workersaas.sdk.model.park.enterprise.query.ParkEnterpriseQueryRequest;
import com.workersaas.sdk.model.park.enterprise.query.ParkEnterpriseQueryResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * <h1>企业园区测试</h1>
 *
 * @author zhoul
 */
public class WorkerSaasParkEnterpriseTest {
    /**
     * 日志
     */
    private static final Log log = LogFactory.getLog(WorkerSaasParkEnterpriseTest.class);

    public static void main(String[] args) {
        // 查询企业园区列表
        List<ParkEnterpriseModel> enterpriseParkList = getList();
        long enterpriseParkId = enterpriseParkList.isEmpty() ? 1L : enterpriseParkList.get(0).getId();

        // 查询企业园区详情
        query(enterpriseParkId);
    }

    /**
     * 获取企业园区列表
     */
    private static List<ParkEnterpriseModel> getList() {
        ParkEnterpriseGetListRequest request = new ParkEnterpriseGetListRequest();
        log.info(String.format("查询企业园区可用列表请求数据: %s", Json.toString(request)));
        ParkEnterpriseGetListResponse response = Config.CLIENT.request(request);
        log.info(String.format("查询企业园区可用列表响应数据: %s", Json.toString(response)));
        return response.getParkEnterpriseList();
    }

    private static void query(long enterpriseParkId) {
        ParkEnterpriseQueryRequest request = new ParkEnterpriseQueryRequest();
        request.setId(enterpriseParkId);
        log.info(String.format("查询企业园区详情请求数据: %s", Json.toString(request)));
        ParkEnterpriseQueryResponse response = Config.CLIENT.request(request);
        log.info(String.format("查询企业园区详情响应数据: %s", Json.toString(response)));
    }

}
