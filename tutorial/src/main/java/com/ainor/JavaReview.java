package com.ainor;

import java.util.HashMap;

public class JavaReview {
    public static void main(String[] args) {
        int playerPosition = 1;
        final int BOARD_SIZE = 100;

        HashMap<Integer, Integer> boardActions = new HashMap<>();

        boardActions.put(10, 15);
        boardActions.put(20, -35);
        boardActions.put(27, 55);
        boardActions.put(72, -15);
        boardActions.put(64, 5);


        while (playerPosition < BOARD_SIZE) {
            int randomDice = (int) (Math.random() * 100 % 6) + 1;
            playerPosition = playerPosition + randomDice;

            Integer action = boardActions.get(playerPosition);
            if (action != null) {
                playerPosition = playerPosition + action;
                System.out.print("Hit an action tile! Move " + action + " steps");
            }

            System.out.println("Player rolled " + randomDice + ", Player now at " + playerPosition);
        }
    }
}
