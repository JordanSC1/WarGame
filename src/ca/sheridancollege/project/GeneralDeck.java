/*
    [Class name]
    Author: [the name of the person who created the class. It might be different from yours]
    Date: [date]

    Description
    [Description about the class]
    */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrgra
 */
public class GeneralDeck extends GroupOfCards {
    ArrayList<Card> deck  = new ArrayList<>();
    
    public GeneralDeck(int size) {
        super(size);
        super.showCards().equals(deck);
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
