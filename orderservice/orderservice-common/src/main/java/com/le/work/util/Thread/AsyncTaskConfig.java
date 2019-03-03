package com.le.work.util.Thread;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2019/2/28</div>
 * 线程池配置
 * @author lekp
 * @since 1.0
 */
@Configuration
@ComponentScan("com.le")
// 利用@EnableAsync注解开启异步任务支持
@EnableAsync
public class AsyncTaskConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 最小线程数
        taskExecutor.setCorePoolSize(5);
        // 最大线程数
        taskExecutor.setMaxPoolSize(10);
        // 等待队列
        taskExecutor.setQueueCapacity(25);
        // 允许核心线程空闲时线程数量降为0
        taskExecutor.setAllowCoreThreadTimeOut(true);
        // 线程池维护线程所允许的空闲时间.超出核心线程数的空闲线程的最大存活时间
        taskExecutor.setKeepAliveSeconds(40);
        // 线程名称前缀
        taskExecutor.setThreadNamePrefix("MyAsync-");
        taskExecutor.initialize();

        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {

        return new MyAsyncExceptionHandler();
    }
}
