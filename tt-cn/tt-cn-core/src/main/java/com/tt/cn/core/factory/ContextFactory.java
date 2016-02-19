package com.tt.cn.core.factory;

/**
 * Created by bellag on 1/27/16.
 */
public class ContextFactory {
    public static Context getInstance() {
        Object context = ContextImpl.getInstance();
        if(context == null) {
            context = new ContextImpl();
        }

        return (Context)context;
    }
}
