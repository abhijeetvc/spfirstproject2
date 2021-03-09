package com.firstspproject.spfirstproject.controller;

import com.firstspproject.spfirstproject.impl.MyImpl;
import com.firstspproject.spfirstproject.repository.MyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Field based dependency injection
   // @Autowired   // Use spring's dependency injection facilities
   // private MyImpl myImpl;  //Reference

     @Autowired
     @Qualifier("myimpl1")
     private MyInterface myInterface;

     @Autowired
     @Qualifier("myimpl2")
     private MyInterface myInterface2;

//    public MyController(MyImpl myImpl){   //Constructor based DI
//        this.myImpl=myImpl;
//    }

//    @Autowired
//    public void setMyImpl(MyImpl myImpl) {   // Setter method based DI
//        this.myImpl = myImpl;
//    }

    @GetMapping("/check")
    public String getData(){
        return myInterface2.check();
    }
}
