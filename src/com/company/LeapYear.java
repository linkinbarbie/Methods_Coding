package com.company;

public class LeapYear {

    public static void main(String[] args) {
        boolean Final_Ans = isLeapYear(1800);
        System.out.println(Final_Ans);
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            double remainder = year % 4;//step 2
            if (remainder == 0)
            {remainder = year % 100;}
                if (remainder == 0)
                { remainder = year % 400;}
                if (remainder == 0)

                { return true;}

              else
                {remainder = year % 4;}
                if(remainder == 0)
                {return true;}
              else
            {return false;}
            }



        else {
            return false;
        }

    }
}

