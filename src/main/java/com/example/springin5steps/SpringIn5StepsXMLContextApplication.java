package com.example.springin5steps;

import com.example.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
            LOGGER.info("{}", xmlPersonDAO);
            LOGGER.info("{}", xmlPersonDAO.getXMLJdbcConnection());
        }
    }
}
