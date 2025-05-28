package com.apisupport.intro.sprOne;


//import org.springframework.stereotype.Component;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//we are using appConfig thats why no need for component
//@Component
public class apple {
    void eatApple(){
        System.out.println("khatam hogaya apple");
    }

    @PostConstruct
    void appleIsGoingToBeUsed(){
        System.out.println("Creating the apple bean before use");
    }

//    by default it is called when the applivatiom is closed
    @PreDestroy
    void appleisUsedAndBeingEnded(){
        System.out.println("Destroying Apple BEan");
    }
}
