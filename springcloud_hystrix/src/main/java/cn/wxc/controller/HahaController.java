package cn.wxc.controller;

import cn.wxc.Service.HahaService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: HahaController
 * Date: 2020/8/14 15:36 周五
 * yy:猥琐别浪，等我发育。
 */
@RestController
public class HahaController {
    @Autowired
    private HahaService hahaService;


    @RequestMapping("Hystrix/get/user/{uid}")
    //使用熔断的注解（下面加方法）
    @HystrixCommand(fallbackMethod = "RongDuanHuiXian")
    public String showHaha(@PathVariable("uid") String uid){
        //如何使熔断生效，抛异常
        if(uid == null || "1002".equals(uid)){
            throw new RuntimeException("该UID=" + uid + "的值没有查到");
        }
        return hahaService.showHaha(uid);
    }

    public String RongDuanHuiXian(@PathVariable("uid") String uid){
        return "这里是熔断的方法处理结果，通过ID=" + uid + "，用于显示用户信息过程出错了";
    }
}
