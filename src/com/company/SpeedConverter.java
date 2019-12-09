package com.company;


public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(0.0);
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;

        } else {
            double answer = kilometersPerHour/1.609;
            return Math.round(answer); //update with the conversion


        }
    }

    public static void printConversion(double kilometersPerHour) {

         if (kilometersPerHour >= 0)
         {long milesPerHour = toMilesPerHour(kilometersPerHour);
          System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");}
         else
         {
             System.out.println("Invalid Value");
//


        }
    }
    }


