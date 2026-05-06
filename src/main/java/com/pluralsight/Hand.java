package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private String name;

    public Hand(String name){
        cards = new ArrayList<>();
        this.name = name;
    }

    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for(Card card: cards){
            value += card.getPointValue();
        }
        return value;
    }
}
