package cn.wxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //这里用EDC 不能再用EEC，因为这里不是erueka
public class SpringcloudAlibabaProviderPayment9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaProviderPayment9001Application.class, args);
    }

}
