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
public class GeneralDeck extends GroupOfCards {
    ArrayList<Card> deck;
    
    public GeneralDeck(int size) {
        super(size);
    }
    
    public void addCards(GroupOfCards cardPile, int numCards){
        for (int i = 0; i < numCards; i++) {
            super.showCards().add(cardPile.showCards().remove(i));
        }
    }
    
    public void addCard(Card card) {
        super.showCards().add(card);
    }
}
