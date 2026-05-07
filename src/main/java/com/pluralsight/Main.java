package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hand> players = new ArrayList<Hand>();

        //Create all the players and hands
        System.out.print("How many players are there? ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.printf("What is the name of Player %d? \n",i);
            String name = scanner.nextLine();
            Hand hand = new Hand(name);
            players.add(hand);
        }

        //Create deck for game and deal all the players two cards
        Deck deck = new Deck();
        deck.shuffle();
        for (Hand player: players){
            Card card1 = deck.deal();
            Card card2 = deck.deal();
            player.deal(card1);
            player.deal(card2);
        }

        //Add hit and stand functionality
        for (Hand hand: players) {
            while(hand.getValue() <= 21) {
                hand.printInfo();
                System.out.println("What do you want to do?\n\t" +
                        "1) Hit       2) Stand");
                int command = scanner.nextInt();
                if (command == 1) {
                    Card newCard = deck.deal();
                    hand.deal(newCard);
                    } else if (command == 2) {
                    break;
                }
                }
            }

        //Show everyone's cards and calculate winner
        String winner = "";
        int highest = 0;
        for (Hand hand: players){
            if (hand.getValue() > highest && hand.getValue() <= 21){
                highest = hand.getValue();
                winner = hand.getName();
            }
            hand.printInfo();
        }

        System.out.printf("The winner is %s!", winner);
    }
}
