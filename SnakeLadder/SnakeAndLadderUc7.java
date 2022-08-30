package com.SnakeLadder;

public class SnakeAndLadderUc7 {
    public static final int Is_LADDER = 1;
    public static final int IS_SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    static int diceCount = 0;
    static String turn = "Player1";

    public static void main(String[] args) {
        int player1Position = 0;
        int player2Position = 0;
        int player1DiceCount = 0;
        int player2DiceCount = 0;
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            diceCount++;
            if (turn.equals("Player1")) {
                System.out.println("Player1 current Position : " + player1Position);
                ++player1DiceCount;
                player1Position = twoPlayers(player1Position);
                System.out.println("player1 position After Die Roll : " + player1Position);
                turn = "player2";
            } else {
                System.out.println("Player2 current Position : " + player1Position);
                ++player2DiceCount;
                player2Position = twoPlayers(player2Position);
                System.out.println("Player Position After Die Roll : " + player2Position);
                turn = "Player1";

            }

        }
        if (player1Position == WINNING_POSITION) {
            System.out.println("player1 Win The game");
        } else {
            System.out.println("Player2 Win The Game");
        }
        System.out.println("Dice Count Of Player1 : " + player1DiceCount);
        System.out.println("Dice Count Of Player2 : " + player2DiceCount);

        System.out.println(" No. of Times Roll Die is : " + diceCount);
    }
    public static int twoPlayers(int position){
        int diceNumber = (int) (Math.floor(Math.random()*10) % 6 +1);
        System.out.println("DiceNmber is : " + diceNumber);

        int option = (int) (Math.floor(Math.random()*10) % 2 +1);
        switch (option){
            case Is_LADDER :
                System.out.println("Ladder For Player");
                position = position +diceNumber;
                if (turn.equals("player1")){
                    turn = "player1";
                }
                else if (turn.equals("player2")){
                    turn = "player2";
                }
                if (position > WINNING_POSITION){
                    System.out.println("NoPlay Stay In The Current Position");
                    position = position - diceNumber;

                }
                break;
            case IS_SNAKE:
                System.out.println("Snake For The Player");
                position = position - diceNumber;
                if (position < 0){
                    position = 0;

                }
                break;
            default:
                System.out.println("Noplay for The Player");
                position = position;
                break;
        }
        return position;

    }


    }
