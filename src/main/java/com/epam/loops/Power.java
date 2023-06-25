package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int sum = 1;
        while (power > 0) {
            sum = sum * numberToPrint;
            power--;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
