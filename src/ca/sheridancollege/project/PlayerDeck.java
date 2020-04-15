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
public class PlayerDeck extends GeneralDeck {
    ArrayList<Card> deck;
    public PlayerDeck(int size) {
        super(size);
        deck = super.showCards();
        
    }
    
    public Card drawCard(){
        return super.showCards().remove(0);
    }
}
