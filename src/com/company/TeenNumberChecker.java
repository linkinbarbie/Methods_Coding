package com.company;


//this class checks that either of the parameters in the method is between 13 and 19. It will return true if it is.
public class TeenNumberChecker {

    public static void main(String[] args) {
   boolean Answer = hasTeen(1,13,20 );
        System.out.println(Answer);
        boolean answers = isTeen(14);
        System.out.println(answers);
    }

    public static boolean hasTeen (int first, int second, int third) {

     if((first >= 13 && first <= 19)||(second >= 13 && second <= 19)|| (third >= 13 && third <= 19))
     {return true;}
     else {return false;}

    }

    public static boolean isTeen (int Number) {
        if (Number >= 13 && Number <= 19)
        {return true;}
        else
        {return false;}

    }









}
