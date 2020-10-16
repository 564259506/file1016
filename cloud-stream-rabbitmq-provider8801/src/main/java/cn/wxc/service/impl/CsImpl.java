package cn.wxc.service.impl;

import cn.wxc.service.Cs;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: CsImpl
 * Date: 2020/9/8 18:59 周二
 * yy:猥琐别浪，等我发育。
 */
@EnableBinding(Source.class)
public class CsImpl implements Cs {
    @Override
    public void cs() {
        System.out.println("这里是测试");
    }
}
