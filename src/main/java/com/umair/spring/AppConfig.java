package com.umair.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // it define the class as bean configuration xml alternative
public class AppConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }

    // Additional bean definitions, configuration, etc.
    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

}
