package cn.wxc.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: MyGatewayConfig
 * Date: 2020/8/17 9:41 周一
 * yy:猥琐别浪，等我发育。
 */
@Configuration
public class MyGatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
                                                      //配置的patterns需要和跳转地址后的请求一致/guoji  &  guoji
        routes.route("path_route_atguigu", r -> r.path("").uri("https://www.baidu.com/")).build();
        return routes.build();
    }
}
