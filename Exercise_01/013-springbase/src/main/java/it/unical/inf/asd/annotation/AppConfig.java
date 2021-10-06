package it.unical.inf.asd.annotation;

import it.unical.inf.asd.annotation2.ext.ManagerBean;
import it.unical.inf.asd.annotation2.ext.ManagerBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "it.unical.inf.asd.annotation")
public class AppConfig {

}