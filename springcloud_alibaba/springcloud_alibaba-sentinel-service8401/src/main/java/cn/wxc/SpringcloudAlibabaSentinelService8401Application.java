package cn.wxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudAlibabaSentinelService8401Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaSentinelService8401Application.class, args);
    }

}
