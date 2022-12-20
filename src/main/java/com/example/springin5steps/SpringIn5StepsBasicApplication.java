package com.example.springin5steps;

import com.example.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springin5steps")
public class SpringIn5StepsBasicApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

            System.out.println(binarySearch);
            System.out.println(binarySearch1);

            System.out.println(binarySearch.binarySearch(new int[]{1, 566, 7}, 8));
        }
    }
}
