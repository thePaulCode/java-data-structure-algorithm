package dev.thepaulcode;

import dev.thepaulcode.polynomialalgorithm.CalculatingTimeComplexityPolynomial;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // First algorithm to find sum of n natural numbers

//        double now =  System.currentTimeMillis();
//
//        Time time = new Time();
//
//        System.out.println("Sum: " + time.findSum(99999));
//        System.out.println("Total " + (System.currentTimeMillis() - now) + "ms");

        CalculatingTimeComplexityPolynomial timeComplexityPolynomial = new CalculatingTimeComplexityPolynomial();
        timeComplexityPolynomial.print(3);

        }




}