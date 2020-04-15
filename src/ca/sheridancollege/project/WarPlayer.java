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
public class WarPlayer extends Player {
    private GeneralDeck winningsPile;
    private PlayerDeck deck;
    private Card cardInPlay;
    public WarPlayer(String name) {
        super(name);
        winningsPile = new GeneralDeck(0);
        deck = new PlayerDeck(0);
    }
    
    @Override
    public void play(){
        if (deck.showCards().size() > 0) {
            cardInPlay = deck.drawCard();            
        }
    }
    
    public GeneralDeck getWinningsPile() {
        return winningsPile;
    }

    public PlayerDeck getDeck() {
        return deck;
    }

    public Card getCardInPlay() {
        return cardInPlay;
    }
}
