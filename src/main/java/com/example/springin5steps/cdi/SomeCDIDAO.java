package com.example.springin5steps.cdi;


import javax.inject.Named;

@Named
public class SomeCDIDAO {
    public int[] getData() {
        return new int[]{5, 89, 100};
    }
}
