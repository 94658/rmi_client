package com.idah.rmi_client;

import com.idah.rmi_client.services.HellowWorldRMIService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@SpringBootApplication
public class RmiClientApplication {

    @Bean
    RmiProxyFactoryBean rmiProxy() {// to connect to the RMI Service
        RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
        bean.setServiceInterface(HellowWorldRMIService.class);
        bean.setServiceUrl("rmi://localhost:1099/helloworldrmiservice");

        return bean;
    }
    public static void main(String[] args)
    {
        HellowWorldRMIService helloWorldRMIService = SpringApplication.run(RmiClientApplication.class, args)
                .getBean(HellowWorldRMIService.class);

        System.out.println("================Client Side ========================");

        System.out.println(helloWorldRMIService.printHelloWorld("it's Idah"));
//        SpringApplication.run(RmiClientApplication.class, args);
    }



}
