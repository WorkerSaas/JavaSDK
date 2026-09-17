package com.workersaas.sdk.model.tax.confirmincome;

import com.workersaas.sdk.common.base.AbstractResponse;
import com.workersaas.sdk.common.base.Json;
import com.workersaas.sdk.model.tax.IncomeModel;

/**
 * <h1>响应模型</h1>
 *
 * @author Hamm.cn
 */
public class TaxConfirmIncomeResponse extends AbstractResponse<TaxConfirmIncomeResponse> {
    /**
     * 计算模型
     */
    private IncomeModel incomeModel;

    /**
     * 解析数据
     *
     * @param data 解密后的data数据
     */
    @Override
    public TaxConfirmIncomeResponse parseData(String data) {
        return this.setIncomeModel(Json.parse(data, IncomeModel.class));
    }

    public IncomeModel getResponse() {
        return incomeModel;
    }

    public TaxConfirmIncomeResponse setIncomeModel(IncomeModel incomeModel) {
        this.incomeModel = incomeModel;
        return this;
    }
}
