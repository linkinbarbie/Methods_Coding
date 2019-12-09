package com.company;

public class Main {

    public static void main(String[] args) {
        //methods make it easier to read your code
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        int highScorePosition  = calculateHighScorePosition(1500);
        displayHighScorePosition("Mason Perty", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Judge Rosen", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Juju Manster", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Kerry Ryman", highScorePosition);
    }
    //ensure your new method is outside the old one and
    //Main is a method of its own

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)//check if the colour is light gray to see it is not being used
    {//calculateScore is the method(the data type and variables are the parameters)
//void means do not return anything

        if (gameOver == true) {
            int FinalScore = score + (levelCompleted * bonus);
            FinalScore += 2000;
            return FinalScore;
        }
        return -1;
        //note that return must always return a value
        // else
        // {int FinalScore = -1;
        //     System.out.println("Your final score was " + FinalScore);
        //     return FinalScore;}

        //you can create variables in the code block but cannot reference
        //them outside the code block
        // return keyword must always return a value.
        //Especially in a boolean situation.

    }//challenge

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }
 //a void method can be known as a procedure
 // a method can also be known as a function

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
//
int position = 4; //assuming position 4 will be returned
        if (playerScore >= 1000){
            position = 1;}
            else if (playerScore >= 500)
            {position = 2; }
            else if (playerScore >= 100)
        {position = 3;}
            return position;}//an alternative way of not using multiple returns
}




