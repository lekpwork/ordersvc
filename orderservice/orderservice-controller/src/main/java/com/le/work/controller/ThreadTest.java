package com.le.work.controller;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2019/2/28</div>
 *
 * @author lekp
 * @since 1.0
 */
@Component
public class ThreadTest {

    @Resource
    private ThreadService threadService;


    public void test(String msg) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+":"+msg);

        threadService.executeAsyncTask(msg);

    }

}
