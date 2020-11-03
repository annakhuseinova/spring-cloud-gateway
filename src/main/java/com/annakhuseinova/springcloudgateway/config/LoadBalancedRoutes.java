package com.annakhuseinova.springcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local-discovery")
public class LoadBalancedRoutes {

    /*
    * Here we use load balancer to balance messages across multiple services. We just need to specify the name
    * of the service as Cloud Gateway will request the address of the service from Eureka Server.
    * */
    public RouteLocator loadBalancedRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(route -> route.path("/somepath").uri("lb://some-service"))
                .build();
    }
}
