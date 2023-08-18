package com.interswicth;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    SimpleCalculator(double first, double second) {
        this.firstNumber = first;
        this.secondNumber = second;
    }

    public double addTowNumbers() {
        return this.firstNumber + this.secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
