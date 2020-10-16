package cn.wxc.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Author:wxc
 * project: springcloud_alibaba
 * ClassName: RestTemplate
 * Date: 2020/8/19 14:46 周三
 * yy:猥琐别浪，等我发育。
 */
//
//@Configuration
//public class RestTemplateConfig {
//
//    @Bean
//    @LoadBalanced    //开启负载均衡
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }
//}

