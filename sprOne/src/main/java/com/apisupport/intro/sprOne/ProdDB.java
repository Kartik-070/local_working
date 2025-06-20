package com.apisupport.intro.sprOne;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")
public class ProdDB implements DB{
    public String getData(){
        return "Data from ProdDb trying in office";
    }
}
