package com.tt.cn.core.logger;

import org.slf4j.Logger;

/**
 * Created by bellag on 1/27/16.
 */
public class GlobalLogger {
    private static Logger logger;

    public static Logger getLogger() {
        return logger;
    }
}
