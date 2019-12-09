package com.company;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)

    {   if (kiloBytes  >= 0)
    {int megabytes = Math.round(kiloBytes/1024);
        int remainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes
                + " MB and " + remainder + " KB");}
        else
    {
        System.out.println("Invalid Value");}

    }

}
