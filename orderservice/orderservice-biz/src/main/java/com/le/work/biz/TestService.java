package com.le.work.biz;

import com.le.work.util.Log.LogUtil;
import org.springframework.stereotype.Service;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2019/3/1</div>
 *
 * @author lekp
 * @since 1.0
 */
@Service
public class TestService {
    public void say(){
        LogUtil.debug("hello");
    }
}
