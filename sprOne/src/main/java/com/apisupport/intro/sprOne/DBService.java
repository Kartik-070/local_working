package com.apisupport.intro.sprOne;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
    private DB db;

//    This method is called constructor dependency injection
//    Using Constructor injection helps you make the DB Final and no other place the DB can be updatedand it will immutable
    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }


}
