package com.simplon.SumOfSeries;


public class SumOfSeries
{


public String getSumOfSeries(int parameter){
    double result = 0;
    for(int i =0; i < parameter; i+=3 ) {
          result += 1/(1 + i);
    }
    return String.valueOf(result);
}

    public static void main( String[] args )
    {
        SumOfSeries sumOfSeries = new SumOfSeries();
        System.out.println( sumOfSeries.getSumOfSeries(5));
    }
}
