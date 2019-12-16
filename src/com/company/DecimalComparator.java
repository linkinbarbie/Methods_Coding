package com.company;

//This should compare the two parameters in the method up to 3 decimal places only

public class DecimalComparator {

    public static void main(String[] args) {


        boolean Ans = areEqualByThreeDecimalPlaces(0.78700, 0.78779);
        System.out.println(Ans);

    }

    public static boolean areEqualByThreeDecimalPlaces(double frNumber, double scNumber) {

          double frFormat =  frNumber * 1000;//Update the format to focus on the required decimal places
          double scFormat =  scNumber * 1000;
          int Final_1 = ((int) frFormat);//cast to integer to ensure the decimal places do not mess up the comparison
         int Final_2 = ((int) scFormat);

         if(Final_1 == Final_2)

         {
            return true;
        } else {
            return false;
        }

    }
}
