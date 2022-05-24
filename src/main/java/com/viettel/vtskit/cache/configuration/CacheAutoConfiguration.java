package com.viettel.vtskit.cache.configuration;

import com.viettel.vtskit.cache.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableConfigurationProperties(CacheProperties.class)
public class CacheAutoConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "vtskit.redis")
    public RedisProperties redisConfigurationProperties(){
        return new CacheProperties();
    }

    @Bean
    public CacheService cacheService(){
        return new CacheService();
    }

}
