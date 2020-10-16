package cn.wxc.controller;

import cn.wxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: UserController
 * Date: 2020/8/14 13:41 周五
 * yy:猥琐别浪，等我发育。
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("get/user/{uid}")
    public String getUser(@PathVariable("uid") String uid){
        return userService.getUserById(uid);
    }

    @RequestMapping("get/user/haha/{uid}")
    public String getUser_haha(@PathVariable("uid") String uid){
        return userService.getUserById(uid);
    }
}
