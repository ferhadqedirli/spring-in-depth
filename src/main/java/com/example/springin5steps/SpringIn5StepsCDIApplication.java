package com.example.springin5steps;

import com.example.springin5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springin5steps")
public class SpringIn5StepsCDIApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class)) {
            SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

            LOGGER.info("{} dao - {}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
        }
    }
}
