package com.SnakeLadder;

import java.util.Scanner;

public class SnakeAndLadderUc3 {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Press 1 To Start The Snake and Ladder game:");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        if (start == 1) {
            System.out.println("Game is Going To start");
            System.out.println("Checking For Player Option");
            int playerOption = (int) (Math.floor(Math.random() * 10) % 3);
            int diceNumber = (int) (Math.floor((Math.random() * 10) % 6 + 1));
            switch (playerOption) {
                case 0:
                    System.out.println("Player selected for NoPlay at Position Number:" + start);
                    break;
                case 1:
                    System.out.println("Player Got Ladder At Position Number : " + start);
                    playerPosition += diceNumber;
                    System.out.println("After Ladder Player Is Went To Position : " + start);
                    break;
                case 2:
                    System.out.println("Player Got Snake At Position Number : " + start);
                    playerPosition -= diceNumber;
                    System.out.println("After Snake Player Is Went To Position : " + start);
                    break;
            }

        } else {
            System.out.println("Press 1 to Start The Game");
        }
    }


}

