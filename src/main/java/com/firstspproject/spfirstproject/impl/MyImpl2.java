package com.firstspproject.spfirstproject.impl;

import com.firstspproject.spfirstproject.repository.MyInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("myimpl2")
public class MyImpl2 implements MyInterface {

    @Override
    public String check() {
        return "Hello Spring Program";
    }
}
