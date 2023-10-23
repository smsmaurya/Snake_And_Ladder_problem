package com.bridgeLabz;

public class ReachWinningPositionUC4 {
    public static void main(String[] args) {
        int playerPosition = 0;
        int notPlay = 0;
        int useLadder = 1;
        int snakeBites = 2;
        while(playerPosition<100){
            int option = (int) (Math.random()*10)%3;
            int dice = (int)(Math.random()*10)%6 +1;

            if(option==notPlay){
                System.out.println("Player stays at same position "+ playerPosition);
            } else if (option==useLadder) {
                if(playerPosition<100){
                    playerPosition += dice;
                    System.out.println("After use ladder Player position is :"+playerPosition);
                }
            } else if (option==snakeBites) {
                playerPosition -= dice;
                if(playerPosition<0){
                    playerPosition=0;
                    System.out.println("Player starts from o.");
                }else{
                    System.out.println("After snake bites the player position is : "+playerPosition);
                }
            }
        }
    }
}
