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
        } else if (winningsPile.showCards().size() > 0) {
            deck.addCards(winningsPile.showCards().subList(0, 
                    winningsPile.showCards().size()));
            deck.shuffle();
            cardInPlay = deck.drawCard();
        }
    }
    
    @Override
    public boolean isDead(){
        if (deck.getSize() == 0 && winningsPile.getSize() == 0 && 
                cardInPlay == null) {
            return true;
        }
        return false;
    }
    
    public GeneralDeck getWinningsPile() {
        return winningsPile;
    }

    @Override
    public void clearCard() {
        this.cardInPlay = null;
    }

    @Override
    public PlayerDeck getDeck() {
        return deck;
    }

    @Override
    public Card getCard() {
        return cardInPlay;
    }
}
