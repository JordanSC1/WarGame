/*
    GeneralDeck.java
    Author: Jordan Graham
    Date: 2020-04-10

    Description
    A general deck class with the capability to add one or more cards, and clear
    the deck.
    */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrgra
 */
public class GeneralDeck extends GroupOfCards {
    
    public GeneralDeck(int size) {
        super(size);
    }
    
    public void addCards(List<Card> cardPile){
        for (Card card : cardPile) {
            addCard(card);
        }
    }
    
    public void addCard(Card card) {
        super.showCards().add(card);
        super.setSize(super.showCards().size());
    }
    
    public void clearDeck(){
        super.showCards().clear();
    }
}
