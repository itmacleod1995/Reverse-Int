package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
