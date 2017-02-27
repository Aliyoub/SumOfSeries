package com.simplon.SumOfSeries;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple SumOfSeries.
 */
public class SumOfSeriesTest
{
 @Test
 public void getSumOfSeries(){
     // set
     double number = 1 + 1/4;

     //test
     SumOfSeries sumOfSeries = new SumOfSeries();
     String result = sumOfSeries.getSumOfSeries(2);

     //assert
     assertEquals("1.25", result);

 }

}
