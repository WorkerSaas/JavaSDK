package com.workersaas.sdk.park;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.common.base.WorkerSaasClient;
import com.workersaas.sdk.common.base.WorkerSaasConfig;
import com.workersaas.sdk.common.enums.WorkerSaasArithmetic;
import com.workersaas.sdk.model.order.OrderModel;
import com.workersaas.sdk.model.order.query.QueryTaskAgreementDetailRequest;
import com.workersaas.sdk.model.order.query.QueryTaskAgreementDetailResponse;
import com.workersaas.sdk.model.park.order.GetParkOrderDetailRequest;
import com.workersaas.sdk.model.park.order.GetParkOrderDetailResponse;
import com.workersaas.sdk.model.park.order.GetParkOrderPageRequest;
import com.workersaas.sdk.model.park.order.GetParkOrderPageResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <h1>园区订单测试</h1>
 *
 * @author zhoul
 */
public class WorkerSaasParkOrderTest {
    /**
     * 日志
     */
    private static final Log log = LogFactory.getLog(WorkerSaasParkOrderTest.class);

    /**
     * WorkerSaas客户端
     */
    private static final WorkerSaasClient client;

    static {
        WorkerSaasConfig workerSaasConfig = WorkerSaasConfig.create()
                .setAppKey(Config.APP_KEY)
                .setAppSecret(Config.APP_SECRET)
                .setGateway(Config.GATEWAY)
                .setArithmetic(WorkerSaasArithmetic.AES);
        client = WorkerSaasClient.create(workerSaasConfig);
    }

    public static void main(String[] args) {
        queryPage();
//        query();
//        query2();
    }

    private static void queryPage() {
        GetParkOrderPageRequest request = new GetParkOrderPageRequest();
        OrderModel filter = new OrderModel();
        filter.setPayTimeFrom(1764532800000L);
        filter.setPayTimeTo(1764532860000L);
        request.setFilter(filter);
        GetParkOrderPageResponse response = client.request(request);
        log.info(String.format("查询响应数据: %s", Json.toString(response)));
    }

    private static void query() {
        GetParkOrderDetailRequest request = new GetParkOrderDetailRequest();
        request.setTradeNo("P20251201000052183");
        log.info(String.format("查询请求数据: %s", Json.toString(request)));
        GetParkOrderDetailResponse response = client.request(request);
        log.info(String.format("查询响应数据: %s", Json.toString(response)));
    }



    private static void query2() {
        QueryTaskAgreementDetailRequest request = new QueryTaskAgreementDetailRequest();
        request.setTradeNo("P20251201000052183");
        log.info(String.format("查询请求数据: %s", Json.toString(request)));
        QueryTaskAgreementDetailResponse response = client.request(request);
        log.info(String.format("查询响应数据: %s", Json.toString(response)));
    }

}
