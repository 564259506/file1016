package cn.wxc.controller;

import cn.wxc.service.HahaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: UserController
 * Date: 2020/8/14 15:18 周五
 * yy:猥琐别浪，等我发育。
 */
@RestController
public class HahaController {

    @Autowired
    private HahaService userService;

    @RequestMapping(value = "get/user/{uid}")
    public String getFeign(@PathVariable("uid") String uid){
        String s = userService.showUserById(uid);
        return s;
    }


    @RequestMapping(value = "Hystrix/get/user/{uid}")
    public String getHystrix(@PathVariable("uid") String uid){
        String s = userService.showHystrix(uid);
        return s;
    }
}
