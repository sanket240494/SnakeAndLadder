package com.SnakeLadder;

public class SnakeLadder {
    public static void main(String[] args) {
        int StartPosition = 0;
        System.out.println("Player at Start Position : " + StartPosition);

        int rolldice = 1 + (int)(Math.random() * 10) % 6;
        System.out.println("player Rolled Dice : " + rolldice);
    }
}
