package com.company;

public class EqualSumCalculator {
    public static void main(String[] args) {
        boolean answer =  hasEqualSum(1,-2,0);
        System.out.println(answer);
}



    public static boolean hasEqualSum(int first, int second, int third) {

        int total = first + second;

        if(total == third)
        {return true;}
        else
        {return false;}


    }
}
