package com.example.demo.config;

import org.redisson.Config;
import org.redisson.Redisson;
import org.redisson.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient getRedisson(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://111.230.99.82:6379").setPassword("songjie");
        return Redisson.create(config);
    }
}
