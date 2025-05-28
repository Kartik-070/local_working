package com.apisupport.intro.sprOne;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
//prim makes it default if not specified
public class DevDB implements DB{
    public String getData(){
        return "Data from DEVDb";
    }
}
