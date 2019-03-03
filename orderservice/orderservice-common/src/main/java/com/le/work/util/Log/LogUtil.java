package com.le.work.util.Log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/1 </div>
 *
 * @author lekp
 * @since 1.0
 */
public class LogUtil {
    private static final Logger log = LoggerFactory.getLogger(LogUtil.class);

    public static void debug(String message){
        if (log.isDebugEnabled()) {
            log.debug(message);
        }
    }

    public static void info(String message){
        if (log.isInfoEnabled()){
            log.info(message);
        }
    }

    public static void warn(String message){
        if (log.isWarnEnabled()){
            log.warn(message);
        }
    }

    public static void erro(String message){
        if (log.isErrorEnabled()){
            log.error(message);
        }
    }
}
