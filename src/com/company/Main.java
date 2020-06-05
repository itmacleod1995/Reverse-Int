package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(reverseInt(987));
    }
    public static int reverseInt(int num){
        int reverse = 0;

        while(num != 0){
            reverse = (reverse * 10) + num % 10;
            num = num / 10;
        }

        return reverse;
    }
}
