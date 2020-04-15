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
public class War {

    public static void main(String[] args) {
        PlayerDeck deck1 = new PlayerDeck(26);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 13; j++) {
                PokerCard card = new PokerCard(j, i);
                deck1.addCard(card);
            }
        }
        System.out.println(deck1.drawCard());
    }
}
