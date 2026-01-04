package com.workersaas.sdk.order;

import com.workersaas.sdk.Config;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.enums.IdCardType;
import com.workersaas.sdk.model.order.create.OrderCreateRequest;
import com.workersaas.sdk.model.order.create.OrderCreateResponse;
import com.workersaas.sdk.model.order.query.OrderQueryRequest;
import com.workersaas.sdk.model.order.query.OrderQueryResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <h1>订单测试</h1>
 *
 * @author zhoul
 */
public class WorkerSaasOrderTest {

    /**
     * 日志
     */
    private static final Log log = LogFactory.getLog(WorkerSaasOrderTest.class);

    public static void main(String[] args) {
        // 创建订单
        String outerTradeNo = create();

        // 查询已创建的订单
//        query("D20251202000000005");
    }

    /**
     * 创建订单
     *
     * @return 外部订单号
     */
    private static String create() {
        // 设置参数
        OrderCreateRequest request = new OrderCreateRequest()
                .setOuterTradeNo("D20251202504000006")
                .setBizAccount("13888888888")
                .setTaskId(5L)
                .setBalance(0.2D)
                .setReason("服务费")
                .setPayAccount("6214863473617777")
                .setIdCardType(IdCardType.CHINA_ID_CARD)
                .setIdCard("500240199110030157");
        log.info(String.format("创建订单请求数据: %s", Json.toString(request)));
        OrderCreateResponse response = Config.CLIENT.request(request);
        log.info(String.format("创建订单响应数据: %s", Json.toString(response)));
        return response.getOrder().getOuterTradeNo();
    }

    /**
     * 查询订单
     *
     * @param outerTradeNo 外部订单号
     */
    private static void query(String outerTradeNo) {
        OrderQueryRequest request = new OrderQueryRequest()
                .setOuterTradeNo(outerTradeNo);
        log.info(String.format("查询订单请求数据: %s", Json.toString(request)));
        OrderQueryResponse response = Config.CLIENT.request(request);
        log.info(String.format("查询订单响应数据: %s", Json.toString(response)));
    }
}
