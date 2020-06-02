package com.dt.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes =routeLocatorBuilder.routes();
        routes.route("path_route_dt",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return  routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes =routeLocatorBuilder.routes();
        routes.route("path_route_dt2",r->r.path("/guonji").uri("http://news.baidu.com/guoji")).build();
        return  routes.build();
    }
}
