package com.in28minutes.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservices.bean.LimitsConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retriveLimitesFromConfigurations() {
	return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("/limits/fallback")
    @HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration")
    public LimitsConfiguration retrieveConfiguration() {
	throw new RuntimeException("Fallback");
    }

    public LimitsConfiguration fallbackRetrieveConfiguration() {
	return new LimitsConfiguration(2222, 22);
    }
}
