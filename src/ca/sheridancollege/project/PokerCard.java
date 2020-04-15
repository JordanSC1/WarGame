/*
    [Class name]
    Author: [the name of the person who created the class. It might be different from yours]
    Date: [date]

    Description
    [Description about the class]
    */

package ca.sheridancollege.project;

/**
 *
 * @author jrgra
 */
public class PokerCard extends Card {
    private static CardValues value;
    private static String suit;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Spades", 
        "Clubs"};
    
    public PokerCard(int val, int suitNumber) {
        this.value = CardValues.values()[val];
        this.suit = SUITS[suitNumber];
    }
    
    @Override
    public String toString(){
        String cardString = value.getName() + " of " + suit;
        return cardString;
    }
}
