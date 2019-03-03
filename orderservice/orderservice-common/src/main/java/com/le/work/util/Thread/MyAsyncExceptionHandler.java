package com.le.work.util.Thread;

import com.le.work.util.Log.LogUtil;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2019/3/1</div>
 * 多线程中捕获异常
 * 抛出异常：throw new IllegalArgumentException 即可捕获
 * @author lekp
 * @since 1.0
 */
public class MyAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        LogUtil.info("-------------》》》捕获线程异常信息");
        LogUtil.info("Exception message - " + throwable.getMessage());
        LogUtil.info("Method name - " + method.getName());
        for (Object param : objects) {
            LogUtil.erro("Parameter value - " + param);
        }
    }
}
