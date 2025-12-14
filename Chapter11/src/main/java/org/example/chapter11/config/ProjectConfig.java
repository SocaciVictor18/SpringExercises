package org.example.chapter11.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
basePackages = "org.example.chapter11.feign")
public class ProjectConfig {
}
