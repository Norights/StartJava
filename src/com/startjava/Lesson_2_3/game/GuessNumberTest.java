package com.startjava.Lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest{
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("Please enter the name of first player: ");
            String name1 = console.nextLine();
            Player player1 = new Player(name1);

            System.out.print("Please enter the name of second player: ");
            String name2 = console.nextLine();
            Player player2 = new Player(name2);

            GuessNumber game = new GuessNumber(player1, player2);
            
            String answer = "no";
            do {
                game.start();
                do {
                    System.out.println("Do you want to continue? [yes/no]:" );
                    answer = console.next();
                } while (!answer.equals("no") && !answer.equals("yes"));  
            } while (answer.equals("yes")); 
        }
    }
