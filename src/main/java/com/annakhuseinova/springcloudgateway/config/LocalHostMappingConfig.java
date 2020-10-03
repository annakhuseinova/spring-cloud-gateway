package com.annakhuseinova.springcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalHostMappingConfig {

    public RouteLocator localHostLocator(RouteLocatorBuilder builder){
        return builder.routes().route(route -> route.path("/somepath").uri("http://localhost:8080")).build();
    }
}
