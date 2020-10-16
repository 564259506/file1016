package cn.wxc.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: UserService
 * Date: 2020/8/14 15:13 周五
 * yy:猥琐别浪，等我发育。
 */

@Component
//@FeignClient("PROVIDER-01")  //调普通的provider
@FeignClient("SPRING-CLOUD-EUREKA-PROVIDER-HYSTRIX")//用熔断Hystrix提供者
public interface HahaService {
    /**
     * 注意：
     *  1. 不能使用@GetMapping或者@PostMapping
     *  2. 如果参数是基本数据类型，必须加@pathVariable进行绑定
     *     如果是pojo，必须加@RequestBody
     *  3. @RequestMapping(value = "get/user/{uid}")  路径和提供者要一样
     */
    @RequestMapping(value = "get/user/{uid}") // 这里地址的provider中的REST
    public String showUserById(@PathVariable("uid") String uid);

    @RequestMapping(value = "Hystrix/get/user/{uid}") // 这里地址的provider中的REST
    public String showHystrix(@PathVariable("uid") String uid);
}
