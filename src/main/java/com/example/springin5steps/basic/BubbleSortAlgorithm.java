package com.example.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}
