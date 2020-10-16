package cn.wxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudAlibabaProviderPayment9002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaProviderPayment9002Application.class, args);
    }

}
