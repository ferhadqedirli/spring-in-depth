package com.example.springin5steps;

import com.example.springin5steps.properties.SomeExternalService;
import com.example.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {

            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            LOGGER.info("someExternalService {}", someExternalService);
            LOGGER.info("url {}", someExternalService.returnServiceURL());
        }
    }
}
