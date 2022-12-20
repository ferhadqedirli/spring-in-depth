package com.example.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

    private final SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(@Qualifier("bubble") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

//    @PostConstruct//bean yaradildiqdan ve dependency ler initialize olduqdan sonra bu metodu cagirmaq ucun istifade olunur
//    public void postConstructor() {
//        LOGGER.info("post constructor");
//    }
//
//    @PreDestroy//bean context den remove olduqda cagirilir
//    public void preDestroy() {
//        LOGGER.info("pre destroy");
//    }
}
