package com.le.work.controller;


import com.le.work.biz.TestService;
import com.le.work.util.Log.LogUtil;
import com.le.work.util.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2019/1/24</div>
 *
 * @author lekp
 * @since 1.0
 */
@Controller
public class TestController extends BaseController {

    @Autowired
    ThreadTest threadTest;

    @Autowired
    ThreadService threadService;

    @Autowired
    TestService testService;

    @GetMapping("test")
    public void test() throws InterruptedException {
        LogUtil.erro("111");
        LogUtil.info("222");
        LogUtil.warn("333");
        LogUtil.debug("444");
    }

    @GetMapping("insertOrderAsync")
    public void insertOrderAsync() throws InterruptedException {
        long a = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            threadService.executeAsynvAddOrder();
        }
        long b = System.currentTimeMillis();
        LogUtil.debug((a - b) + "");
    }

    @GetMapping("insertOrderSync")
    public void insertOrderSync() throws InterruptedException {
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            threadService.executeSynvAddOrder();
        }
        long b = System.currentTimeMillis();
        LogUtil.debug((a - b) + "");
    }

    @GetMapping("test1")
    public void test1() {
        testService.say();
    }

    public static void main(String[] args) {

    }
}
