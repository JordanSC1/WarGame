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
public class PlayerDeck extends GroupOfCards {

    public PlayerDeck(int size) {
        super(size);
    }
    
    public Card drawCard(){
        return showCards().remove(0);
    }
}
