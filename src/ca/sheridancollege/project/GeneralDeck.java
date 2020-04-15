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
    
    public GeneralDeck(int size) {
        super(size);
    }
    
    public void addCards(GroupOfCards cardPile){
        for (Card card : cardPile.showCards()) {
            showCards().add(card);
        }
    }
    
    public void addCard(Card card) {
        super.showCards().add(card);
    }
}
