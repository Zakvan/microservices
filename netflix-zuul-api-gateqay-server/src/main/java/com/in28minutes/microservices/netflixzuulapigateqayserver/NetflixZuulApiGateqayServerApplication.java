package com.in28minutes.microservices.netflixzuulapigateqayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulApiGateqayServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(NetflixZuulApiGateqayServerApplication.class, args);
    }

    public Sampler sampler() {
	return Sampler.ALWAYS_SAMPLE;
    }

}
