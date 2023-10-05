package com.startjava.lesson_2.guess;

import com.startjava.lesson_2.guess.Player;
import com.startjava.lesson_2.guess.GuessNumber;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "";
        while(!option.equals("no")) {
            System.out.println("\nTo start the game you need to specify the names of the players");
            System.out.print("Enter the name of the first player: ");
            Player player1 = new Player(sc.next());
            System.out.print("Enter the name of the second player: ");
            Player player2 = new Player(sc.next());
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.print("Do you want to continue playing? [yes/no]: ");
                option = sc.next();
            } while(!option.equals("yes") && !option.equals("no"));
        }
        sc.close();
    }
}