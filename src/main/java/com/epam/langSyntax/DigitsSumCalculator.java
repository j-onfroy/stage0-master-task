package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        int num;
        while (number > 0) {
            num = number % 10;
            sum = sum + num;
            number = number / 10;
        }
        System.out.println(sum);
    }

}
