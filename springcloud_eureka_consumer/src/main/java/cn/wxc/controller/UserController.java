package cn.wxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: UserController
 * Date: 2020/8/14 13:46 周五
 * yy:猥琐别浪，等我发育。
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get/user/{uid}")
    public  String getUser(@PathVariable("uid") String uid){
        String s = "http://127.0.0.1:8001/get/user/"+uid;
        String forObject = restTemplate.getForObject(s, String.class);
        return forObject;
    }
}
