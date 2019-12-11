package com.company;

public class BarkingDog {

    public static void main(String[] args) {
       boolean Answer = shouldWakeUp(true,22);
        System.out.println(Answer);

    }


    public static boolean shouldWakeUp(boolean Barking, int hourOfDay) {
        if (Barking && (hourOfDay >= 0 && hourOfDay < 8 ||  hourOfDay > 22 && hourOfDay <= 23)) {
            return true;

        }
else {return false;}

    }

}