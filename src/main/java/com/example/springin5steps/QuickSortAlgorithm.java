package com.example.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}
