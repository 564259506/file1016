package cn.wxc.Service.impl;

import cn.wxc.Service.HahaService;
import org.springframework.stereotype.Service;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: HahaServiceImpl
 * Date: 2020/8/14 15:37 周五
 * yy:猥琐别浪，等我发育。
 */
@Service
public class HahaServiceImpl implements HahaService {

    public String showHaha(String uid) {
        return "这是hystrix中的service实现方法，获取用户信息，编号：" + uid;
    }
}
