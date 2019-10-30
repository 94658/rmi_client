package com.idah.rmi_client.services;

import java.util.Date;

public class HellowWorldRMIServiceImpl implements HellowWorldRMIService {
    @Override
    public String printHelloWorld(String msg) {
        System.out.println("================Server Side ========================");
        System.out.println("Inside Rmi IMPL - Incoming msg : " + msg);
        return "Hello " + msg + " :: Response time - > " + new Date();
    }
}
