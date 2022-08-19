package com.SnakeLadder;

public class SnakeAndLadderUc3 {
    int NO_PLAY = 0;
    int LADDER = 1;
    int SNAKE = 2;

    public static void main(String[] args) {

        int rolldice = 1 + (int) ((Math.random() * 10) % 6);
        System.out.println("Player rolled dice: " + rolldice);
        int optionplay = (int) ((Math.random() * 10) % 3);
        if (optionplay == 0) {
            System.out.println("No play");
        } else if (optionplay == 1) {
            System.out.println("ladder");
        } else if (optionplay == 2) {
            System.out.println("snake");
        }
    }

}

