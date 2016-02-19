package com.tt.cn.core.factory;

import java.io.Serializable;

/**
 * Created by bellag on 1/27/16.
 */
public class ContextImpl implements Serializable, Context {
    private static final transient long serialVersionUID = 1L;
    private static transient InheritableThreadLocal<Context> holder = new InheritableThreadLocal();
    private static Object instance;


    public static Object getInstance() {
        return instance;
    }

    @Override
    public void register() {

    }

    @Override
    public void setApplication(String CoreCommon) {

    }

    @Override
    public void clean() {

    }

    @Override
    public void setMerchantId(String merchantId) {

    }

    @Override
    public Object getMerchantId() {
        return null;
    }

    @Override
    public Object getMerchantCountry() {
        return null;
    }

    @Override
    public Object getProcess() {
        return null;
    }
}

