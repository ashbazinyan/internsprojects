package com.tt.cn.core.factory;

import com.tt.cn.core.CoreCommon;

/**
 * Created by bellag on 1/27/16.
 */
public interface Context {
    void register();
    void setApplication(String CoreCommon);

    void clean();

    void setMerchantId(String merchantId);

    Object getMerchantId();

    Object getMerchantCountry();

    Object getProcess();
}
