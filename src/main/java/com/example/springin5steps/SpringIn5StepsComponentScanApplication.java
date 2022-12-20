package com.example.springin5steps;

import com.example.componentscan.ComponentDAO;
import com.example.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
    }

}
