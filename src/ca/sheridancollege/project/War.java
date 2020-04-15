/*
    [Class name]
    Author: [the name of the person who created the class. It might be different from yours]
    Date: [date]

    Description
    [Description about the class]
    */

package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author jrgra
 */
public class War {

    public static void main(String[] args) {
        PlayerDeck gameDeck = new PlayerDeck(52);
        ArrayList<Card> test = new ArrayList<Card>();
        PokerCard card;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card = new PokerCard(j, i);
                gameDeck.addCard(card);
                test.add(new PokerCard(j, i));
            }
        }
        System.out.println("Shuffling Cards");
        gameDeck.shuffle();
        System.out.println("============================");
        for (Card card2 : gameDeck.showCards()) {
            System.out.println(card2.toString());
        }
    }
}
