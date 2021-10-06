package it.unical.inf.asd.annotation2.conf;

import it.unical.inf.asd.annotation2.ext.ManagerBean;
import it.unical.inf.asd.annotation2.ext.ManagerBeanImpl;
import it.unical.inf.asd.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "it.unical.inf.asd.annotation2")
public class AppConfig {

  @Bean(name="managerBean")
  public ManagerBean helloWorld()
  {
    return new ManagerBeanImpl();
  }

  @Bean
  public Country xxx() { return new Country("Italy", 10000000); }
}