package com.SnakeLadder;

import java.util.Scanner;

public class SnakeAndLadderUc5 {
    public static void main(String[] args) {
        int playerPosition = 0;
        int winingPosition = 100;
        System.out.println("Press 1 To Start The Snake and Ladder game: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        if (start == 1) {
            System.out.println("Game Is Going to start");
            for (int i = 0; playerPosition < winingPosition; i++) {
                System.out.println("Checking for Player Option");
                int playerOption = (int) (Math.floor(Math.random() * 10) % 3);
                int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
                switch (playerOption) {
                    case 0:
                        System.out.println("Player Selected For Noplay At position Number : " + playerPosition);
                        playerPosition += 0;
                        break;
                    case 1:
                        System.out.println("Player got ladder At Position Number: " + playerPosition);
                        playerPosition += diceNumber;
                        System.out.println("After Ladder Player Is Went To Posiion :" + playerPosition);
                        break;
                    case 2:
                        System.out.println("Player Got snake At Position Number : " + playerPosition);
                        playerPosition -= diceNumber;
                        System.out.println("After Snake Player Went To Position number : " + playerPosition);
                        if (playerPosition < 0)
                            playerPosition = 0;
                        if (playerPosition > 100)
                            playerPosition = playerPosition - diceNumber;
                        break;
                }
            }
        } else {
            System.out.println("Press 1 To Start The Game");
            System.out.println("Player Reached The Position : " + playerPosition);
        }

    }
}