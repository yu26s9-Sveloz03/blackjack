package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hand> players = new ArrayList<Hand>();

        System.out.print("How many players are there? ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.printf("What is the name of Player %d? \n",i);
            String name = scanner.nextLine();
            Hand hand = new Hand(name);
        }
    }
}
