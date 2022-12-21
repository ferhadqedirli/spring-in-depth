package com.example.springin5steps.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLConfigurationTest {

    @Autowired
    private BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        assertEquals(3, binarySearch.binarySearch(new int[]{}, 3));
    }

}
