package com.SnakeLadder;

import java.util.Scanner;

public class SnakeAndLadderUc6 {
    public static void main(String[] args) {
        int playerPosition = 0;
        int winningPosition = 100;
        int dicecount = 0;
        System.out.println("Enter press 1 to start the Snake and Ladder game:");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        if (start == 1) {
            System.out.println("Game is going to Start");
            for (int i = 0; playerPosition < winningPosition; i++) {
                System.out.println("Checking for Player Option");
                int playerOption = (int) (Math.floor(Math.random() * 10) % 3);
                int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
                switch (playerOption) {
                    case 0:
                        System.out.println("Player Selected for NoPlay at Position Number:" + playerPosition);
                        playerPosition += 0;
                        break;
                    case 1:
                        System.out.println("Player Got ladder at Position Number:" + playerPosition);
                        playerPosition += diceNumber;
                        System.out.println("After ladder player is went to position:" + playerPosition);
                        if (playerPosition > 100)
                            playerPosition = playerPosition - diceNumber;
                        break;
                    case 2:
                        System.out.println("Player got Snake at position Number:" + playerPosition);
                        playerPosition -= diceNumber;
                        System.out.println("After Snake player went to position Number:" + playerPosition);
                        if (playerPosition < 0)
                            playerPosition = 0;
                        if (playerPosition > 100)
                            playerPosition = playerPosition - diceNumber;
                        break;

                }
                dicecount++;
            }


        } else
            System.out.println("Press 1 to start the Game");
        System.out.println("player reached the positon:" + playerPosition);
        System.out.println("No of times dice rolled is:" + dicecount);

    }
}