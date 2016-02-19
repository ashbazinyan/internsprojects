package com.tt.cn.core.logger.trace;

import com.tt.cn.core.factory.Context;
import com.tt.cn.core.factory.ContextFactory;

import java.util.Objects;

/**
 * Created by bellag on 1/27/16.
 */
public class Alert {
    private char[] type;
    private Boolean details;
    private char[] level;
    private char[] application;
    private Object summary;
    private String key;
    private char[] emitter;

    public String format() {
        Context context = ContextFactory.getInstance();
        StringBuilder str = (new StringBuilder("[")).append(this.type).append("][").append(this.level).append("][").append(this.application).append("][").append(this.emitter).append("][").append(Objects.toString(this.key, AlertKey.DEFAULT.toString())).append("][").append(Objects.toString(context.getMerchantId(), "")).append("][").append(Objects.toString(context.getMerchantCountry(), "")).append("][").append(Objects.toString(context.getProcess(), "")).append("][").append(Objects.toString(this.summary, "")).append(']');
        if (this.details != null && !"".equals(this.details)) {
            str.append('[').append(this.details).append(']');
        }

        return str.toString();
    }
}

