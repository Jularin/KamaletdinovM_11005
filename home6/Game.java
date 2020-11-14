package home6;

import java.util.*;

public class Game {
    Scanner sc = new Scanner(System.in);
    Player player1 = new Player(100, "First");
    Player player2 = new Player(100, "Second");
    int firstPlayerHit, secondPlayerHit;


    public void start() {
        while (player1.isAlive() && player2.isAlive()) {
            System.out.println("Enter your hit power:");
            firstPlayerHit = sc.nextInt();
            hit(player2, firstPlayerHit);
            System.out.println("Enter your hit power:");
            secondPlayerHit = sc.nextInt();
            hit(player1, secondPlayerHit);
        }
    }
    public boolean hitValidation(int hitPower){
        return (hitPower >= 1) && (hitPower <= 9);
    }

    public void hit(Player playerToHit, int hitPower) {
        if (hitValidation(hitPower)) {
            if (hitPower <= Math.random() * 10) {
                System.out.printf("Player hit %d to %s\n", hitPower, playerToHit.getName());
                playerToHit.hpMinus(hitPower);
            }
            else{
                System.out.printf("Missed to %s\n", playerToHit.getName());
            }
            System.out.printf("Player %s have %d hp \n", playerToHit.getName(), playerToHit.getHp());
        } else {
            System.out.println("Please enter valid power");
        }
    }
}
