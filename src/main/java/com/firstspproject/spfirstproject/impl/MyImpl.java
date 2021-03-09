package com.firstspproject.spfirstproject.impl;

import com.firstspproject.spfirstproject.repository.MyInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Qualifier

// Bean: Objects that are managed by the spring container
@Component
@Qualifier("myimpl1")
public class MyImpl implements MyInterface {

    @Override
    public String check() {
        return "Hello Spring";
    }
}
