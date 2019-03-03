package com.le.work.controller;

import com.le.work.model.data.OrderDO;
import com.le.work.model.mapper.OrderDOMapper;
import com.le.work.util.Log.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Future;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2019/2/28</div>
 *
 * @author lekp
 * @since 1.0
 */
@Service
public class ThreadService {

    @Autowired
    private OrderDOMapper orderDOMapper;

    // 默认构造方法
    Random random = new Random();


    /**
     * 表明是异步方法
     * 无返回值
     * 通过@Async注解表明该方法是一个异步方法，如果注解在类级别，表明该类下所有方法都是异步方法，而这里的方法自动被注入使用ThreadPoolTaskExecutor 作为 TaskExecutor
     *
     * @param msg
     * @Async时要求是不能有返回值的不然会报错的 因为异步要求是不关心结果的
     */

    @Async
    public void executeAsyncTask(String msg) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "开启新线程执行" + msg);
    }

    @Async
    public void executeAsynvAddOrder() {
        long begin = System.currentTimeMillis();
        LogUtil.debug("当前线程名称为：" + Thread.currentThread().getName()+begin);
        for (int i = 1; i < 100; i++) {
            OrderDO orderDO = new OrderDO();
            orderDO.setOrdername("第" + i);
            orderDO.setOrderdate(new Date());
            orderDO.setOrderfee("aa");
            try {
                orderDOMapper.insert(orderDO);
            } catch (Exception e) {
                throw new IllegalArgumentException("捕获插入数据库错误",e);
            }
        }
        long end = System.currentTimeMillis();
        LogUtil.debug("结束"+end);
    }

    public void executeSynvAddOrder() {
        long begin = System.currentTimeMillis();
        LogUtil.debug("当前线程名称为：" + Thread.currentThread().getName()+begin);
        for (int i = 1; i < 100; i++) {
            OrderDO orderDO = new OrderDO();
            orderDO.setOrdername("第" + i);
            orderDO.setOrderdate(new Date());
            orderDO.setOrderfee("aa");
            orderDOMapper.insert(orderDO);
        }
        long end = System.currentTimeMillis();
        LogUtil.debug("结束"+end);
    }

    /**
     * 异常调用返回Future
     *
     * @param i
     * @return
     * @throws InterruptedException
     */
    @Async
    public Future<String> asyncInvokeReturnFuture(int i) throws InterruptedException {
        System.out.println("input is " + i);
        Thread.sleep(1000 * random.nextInt(i));
        // Future接收返回值，这里是String类型，可以指明其他类型
        Future<String> future = new AsyncResult<String>("success:" + i);

        return future;
    }
}
