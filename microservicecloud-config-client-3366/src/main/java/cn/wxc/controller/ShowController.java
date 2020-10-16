package cn.wxc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: ShowController
 * Date: 2020/8/15 15:04 周六
 * yy:猥琐别浪，等我发育。
 */

@RestController
public class ShowController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String springAppName;

    @RequestMapping("/show")
    public String show() {
        return "show方法[" + serverPort + "] " + springAppName;
    }
}