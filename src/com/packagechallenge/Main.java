package com.packagechallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter, how many seconds would you like to convert:");
        int seconds = scanner.nextInt();
	    Conversion convert = new Conversion(seconds);
        System.out.println(seconds + " seconds = " + convert.secondsToHours() + " hours, " +
                convert.secondsToMinutes() + " minutes and " + convert.getSecond() + " seconds");
    }
}
