package com.github.linyuzai.router.config;


import com.github.linyuzai.router.loadbalancer.LoadBalancerEnhancer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@ConditionalOnClass(LoadBalancerClientFactory.class)
@Configuration(proxyBeanMethods = false)
public class RouterLoadbalancerAutoConfiguration {

    @Bean
    public static LoadBalancerEnhancer loadBalancerEnhancer() {
        return new LoadBalancerEnhancer();
    }
}
