package com.example.microservice.springcloudzuulgatewayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.microservice.springcloudzuulgatewayproxy.filter.ErrorFilter;
import com.example.microservice.springcloudzuulgatewayproxy.filter.PostFilter;
import com.example.microservice.springcloudzuulgatewayproxy.filter.PreFilter;
import com.example.microservice.springcloudzuulgatewayproxy.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringCloudZuulGatewayProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulGatewayProxyApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
