package com.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//to tell this class is a configuration class can load configuration from here
@Configuration
@ComponentScan(basePackages ="com.example.autowired.annotation")
public class AppConfig {
}
