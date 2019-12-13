package com.company;

public class LeapYear {

    public static void main(String[] args) {
        boolean Final_Ans = isLeapYear(1500);
        System.out.println(Final_Ans);
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            double remainder = year % 4;//step 2
            double remainder_2 = year % 100;
            double remainder_3 = year % 400;
            if (remainder == 0 && remainder_2 == 0 && remainder_3 == 0)
            {return true;}
            else if (remainder == 0  && remainder_3 == 0)
            {return true;}
            else if (remainder == 0  && remainder_2 != 0)
            {return true;}

            else {return false;}


                }
          else {return false;}
            }
        }



