package com.SnakeLadder;

import java.util.Scanner;

public class SnakeAndLadderUc2 {
    public static void main(String[] args) {
        System.out.println("Press 1 To Start The Snake and Ladder game:");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Die is Rolling");
        if (start == 1) {
            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Die rolled and displayed Numbers as:" + diceNumber);
        } else
            System.out.println("Press 1 to start the Game");


    }
}