package com.interswicth;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleCalculator calc =
                new SimpleCalculator(45, 34);
        System.out.printf("%s + %s = %s\n",
                calc.getFirstNumber(),
                calc.getSecondNumber(), calc.addTowNumbers());
    }
}
