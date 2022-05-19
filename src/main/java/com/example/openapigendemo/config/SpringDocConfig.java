package com.example.openapigendemo.config;

import org.springdoc.core.SpringDocConfigProperties;
import org.springdoc.core.SpringDocConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
  @Bean
  SpringDocConfiguration springDocConfiguration(){
    return new SpringDocConfiguration();
  }
  @Bean
  SpringDocConfigProperties springDocConfigProperties() {
    return new SpringDocConfigProperties();
  }

}
