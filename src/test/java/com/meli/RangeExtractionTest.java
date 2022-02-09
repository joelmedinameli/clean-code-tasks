package com.meli;

import org.junit.Assert;
import org.junit.Test;

public class RangeExtractionTest {
    @Test
    public void Given_ThreeSequenceElementsList_When_RangeExtraction_Then_ReturnsMinAndMaxValuesRange() {
        Integer[] input = new Integer[]{1, 2, 3};
        String solution = new RangeExtraction().solution(input);
        Assert.assertEquals("1-3", solution);
    }

    @Test
    public void Given_SingleItemList_When_RangeExtraction_Then_ReturnsItemList() {
        Integer[] input = new Integer[]{1};
        String solution = new RangeExtraction().solution(input);
        Assert.assertEquals("1", solution);
    }

    @Test
    public void Given_FiveSequenceElementsList_When_RangeExtraction_Then_ReturnsMinAndMaxValuesRange() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        String solution = new RangeExtraction().solution(input);
        Assert.assertEquals("1-5", solution);
    }

    @Test
    public void Given_FromNegativeToPositiveSequenceElementsList_When_RangeExtraction_Then_ReturnsMinAndMaxValuesRange() {
        Integer[] input = new Integer[]{-3, -2, -1, 0, 1, 2, 3, 4, 5};
        String solution = new RangeExtraction().solution(input);
        Assert.assertEquals("-3-5", solution);
    }

    @Test
    public void Given_TwoSequenceRangeInOneList_When_RangeExtraction_Then_ReturnsTwoRanges() {
        Integer[] input = new Integer[]{-3, -2, -1, 1, 2, 3, 4, 5};
        String solution = new RangeExtraction().solution(input);
        Assert.assertEquals("-3--1,1-5", solution);
    }
    
    @Test
    public void Given_SequenceAndNoSequenceRangeInOneList_When_RangeExtraction_Then_ReturnsSequenceAndNoSequenceRanges() {
        Integer[] input = new Integer[]{-3, -2, -1, 1, 3, 4, 5, 7, 8, 9, 10, 12, 14};
        String solution = new RangeExtraction().solution(input);
        Assert.assertEquals("-3--1,1,3-5,7-10,12,14", solution);
    }

}
