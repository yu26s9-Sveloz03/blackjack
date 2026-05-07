package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean faceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.faceUp = true;
    }

    public String getSuit() {
        if (isFaceUp()) {
            return suit;
        } else {
            return "####";
        }
    }

    public String getValue() {
        if(isFaceUp()){
            return value;
        } else {
            return "####";
        }
    }

    public int getPointValue() {
        if (isFaceUp()) {
            if (getValue().equalsIgnoreCase("A")){
                return 11;
            } else if (getValue().equalsIgnoreCase("K")
                    || getValue().equalsIgnoreCase("Q")
                    || getValue().equalsIgnoreCase("J")) {
                return 10;
            } else {
                return Integer.parseInt(getValue());
            }
        } return 0;
    }

    public boolean isFaceUp(){
        return faceUp;
    }

    public void flip(){
        faceUp = !faceUp;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
