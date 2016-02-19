package com.tt.cn.core.common.tools;

import com.tt.cn.core.logger.GlobalLogger;
import com.tt.cn.core.logger.trace.Alert;

import org.slf4j.Logger;

public final class AlertUtils {

    private static Logger globalLogger = GlobalLogger.getLogger();

    public static void alert(AlertMessages key, final String message) {
        final String alert = createAlertLog(key, message);
        globalLogger.error(alert);
    }

    private static String createAlertLog(AlertMessages key, final String message) {
        return null;
    }
}