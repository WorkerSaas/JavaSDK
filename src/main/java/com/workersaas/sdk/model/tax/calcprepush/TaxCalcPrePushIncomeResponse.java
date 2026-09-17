package com.workersaas.sdk.model.tax.calcprepush;

import com.workersaas.sdk.common.base.AbstractResponse;
import com.workersaas.sdk.common.base.Json;

/**
 * <h1>创建发放订单响应模型</h1>
 *
 * @author Hamm.cn
 */
public class TaxCalcPrePushIncomeResponse extends AbstractResponse<TaxCalcPrePushIncomeResponse> {
    /**
     * 计算模型
     */
    private Response response;

    /**
     * 解析数据
     *
     * @param data 解密后的data数据
     */
    @Override
    public TaxCalcPrePushIncomeResponse parseData(String data) {
        return this.setResponse(Json.parse(data, Response.class));
    }

    public Response getResponse() {
        return response;
    }

    public TaxCalcPrePushIncomeResponse setResponse(Response response) {
        this.response = response;
        return this;
    }

    public static class Response {
        private Double submitBalance;
        private Double balance;
        private Double tax;
        private Double otherTax;
        private Double vatTax;

        public Double getBalance() {
            return balance;
        }

        public Double getOtherTax() {
            return otherTax;
        }

        public Double getSubmitBalance() {
            return submitBalance;
        }

        public Double getTax() {
            return tax;
        }

        public Double getVatTax() {
            return vatTax;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }

        public void setOtherTax(Double otherTax) {
            this.otherTax = otherTax;
        }

        public void setSubmitBalance(Double submitBalance) {
            this.submitBalance = submitBalance;
        }

        public void setTax(Double tax) {
            this.tax = tax;
        }

        public void setVatTax(Double vatTax) {
            this.vatTax = vatTax;
        }
    }
}
