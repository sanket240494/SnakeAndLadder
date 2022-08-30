package com.SnakeLadder;

import java.util.Scanner;

public class SnakeAndLadderUc4 {
    public static void main(String[] args) {
        int playerPosition = 0;
        int winingPosition = 100;
        System.out.println("Press 1 To Start The Snake and Ladder game: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        if (start == 1){
            System.out.println("Gaming is Going To Start");

            for (int i = 0;winingPosition > playerPosition;i++){
                System.out.println("Checking for Player Option");
                int playeroption = (int)(Math.floor(Math.random() * 10) % 3);
                int diceNumber = (int)(Math.floor(Math.random() * 10) % 6 +1);
                switch (playeroption){
                    case 0:
                        System.out.println("Player selected for NoPlay at Position Number: " +playerPosition);
                        break;
                    case 1:
                        System.out.println("Player got ladder at Position Number : " +playerPosition);
                        playerPosition += diceNumber;
                        System.out.println("After Ladder Player Is Went To Position : " + playerPosition);
                        break;
                    case 2:
                        System.out.println("player got Snake at Position Number : " +playerPosition);
                        playerPosition -= diceNumber;
                        System.out.println("After Snake player Went To Position Number : " +playerPosition);
                        if (playerPosition < 0)
                            playerPosition = 0;
                        break;
                }
            }

        }
        else{
            System.out.println("Press 1 To Start The Game");
            System.out.println("Player Reached The Position : " +playerPosition);
        }

    }
}
