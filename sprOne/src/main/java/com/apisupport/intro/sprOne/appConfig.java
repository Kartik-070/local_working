package com.apisupport.intro.sprOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//configuration class
//use it to declare beans of existing normal class
//thisis explicit bean declaration
@Configuration
public class appConfig {

    @Bean
    @Scope("prototype")
//    if singleton(default) the bean is created only once and whenever an object is created same
//    if prototype a new bean is created every time
    apple getApple(){
        return new apple();
    }
}
