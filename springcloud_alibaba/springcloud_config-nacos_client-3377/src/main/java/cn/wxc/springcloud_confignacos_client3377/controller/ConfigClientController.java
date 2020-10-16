package cn.wxc.springcloud_confignacos_client3377.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Transient;


@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController {
    @Value("${config.info}")  //!!!!!这里是从nacos配置中心拿
    private String configInfo;

//    @Value("${aa.bb}")  //!!!!!这里是从nacos配置中心拿
//    private String aa_bb;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }


//    @GetMapping("/aa/bb")
//    public String getAa_bb() {
//        return aa_bb;
//    }
}