package com.ainor;

import java.util.HashMap;

public class JavaReview {
    public static void main(String[] args) {
        int playerPosition = 1;
        final int BOARD_SIZE = 100;

        HashMap<Integer, Integer> snakeOrLadder = new HashMap<>();

        snakeOrLadder.put(10, 15);
        snakeOrLadder.put(20, -35);
        snakeOrLadder.put(27, 55);
        snakeOrLadder.put(72, -15);
        snakeOrLadder.put(64, 5);


        while (playerPosition < BOARD_SIZE) {
            int randomDice = (int) (Math.random() * 100 % 6) + 1;
            playerPosition = playerPosition + randomDice;

            Integer action = snakeOrLadder.get(playerPosition);
            if (action != null) {
                playerPosition = playerPosition + action;
                System.out.print("Hit an action tile! Move " + action + " steps");
            }

            if (playerPosition > 100) {
                playerPosition = 100 - (playerPosition - 100);
                System.out.print("Final position " + playerPosition);
            }


            System.out.println("Player rolled " + randomDice + ", Player now at " + playerPosition);


        }
    }
}
