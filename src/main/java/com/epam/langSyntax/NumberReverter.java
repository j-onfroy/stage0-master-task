package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int residual;
        int reserveNumber = 0;
        while (number > 0) {
            residual = number % 10;
            number = number / 10;
            reserveNumber = reserveNumber * 10 + residual;
        }
        System.out.println(reserveNumber);
    }

}
