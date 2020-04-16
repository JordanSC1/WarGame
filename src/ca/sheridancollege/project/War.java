/*
    [Class name]
    Author: [the name of the person who created the class. It might be different from yours]
    Date: [date]

    Description
    [Description about the class]
    */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jrgra
 */
public class War extends Game{
    
    private WarPlayer player;
    private WarPlayer cpu = new WarPlayer("CPU");
    private ArrayList<Player> players = new ArrayList<>();
    
    public static void main(String[] args) {
        War game = new War("War");
        game.play();
//        GeneralDeck gameDeck = new GeneralDeck(52);
//        ArrayList<Card> test = new ArrayList<Card>();
//        PokerCard card;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 13; j++) {
//                card = new PokerCard(j, i);
//                gameDeck.addCard(card);
//                test.add(new PokerCard(j, i));
//            }
//        }
//        System.out.println("Shuffling Cards");
//        gameDeck.shuffle();
//        System.out.println("============================");
//        for (Card card2 : gameDeck.showCards()) {
//            System.out.println(gameDeck.showCards().indexOf(card2) + " " +card2.toString());
//        }
//        System.out.println("============================");
//        System.out.println(gameDeck.drawCard().toString());
//        System.out.println(gameDeck.drawCard().toString());
//        System.out.println(gameDeck.drawCard().toString());
//        System.out.println("============================");
//        for (Card card2 : gameDeck.showCards()) {
//            System.out.println(gameDeck.showCards().indexOf(card2) + " " +card2.toString());
//        }
    }
    public War(String name) {
        super(name);
    }
    
    public boolean continueGame(){
        for (Player p : super.getPlayers()) {
            if (p.isDead()) {
                return false;
            }
        }
        return true;
    }
    
    public boolean winRound(Player p1, Player p2) {
        if (p1.getCard().getCardValue() == 6 && 
                p2.getCard().getCardValue() == 14) {
            return true;
        }
        return (p1.getCard().getCardValue() > p2.getCard().getCardValue());
    }
    
    public void winner(Player p1, Player p2, GeneralDeck gameDeck){
        gameDeck.addCard(p1.getCard());
        gameDeck.addCard(p2.getCard());
        p1.clearCard();
        p2.clearCard();
    }
    
    
    
    @Override
    public void declareWinner(){
        for (Player p : super.getPlayers()) {
            if (!(p.isDead())) {
                System.out.printf("%s IS THE WINNER!", p.getPlayerID());
                break;
            }
        }
    }
    
    @Override
    public void play(){
        GeneralDeck gameDeck = new GeneralDeck(52);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter player name: ");
        player = new WarPlayer(in.nextLine());
        players.add(cpu);
        players.add(player);
        super.setPlayers(players);
        
        System.out.println("Initializing game deck");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card card = new PokerCard(j, i);
                gameDeck.addCard(card);
            }

        }
        gameDeck.shuffle();
        System.out.println("Finished initializing game deck");
        System.out.println("Initializing Player decks");
        player.getDeck().addCards(gameDeck.showCards().subList(0, 
                gameDeck.getSize() / 2));

        cpu.getDeck().addCards(gameDeck.showCards().subList(gameDeck.getSize() 
                / 2, gameDeck.getSize()));

        gameDeck.clearDeck();
        System.out.println("Finished initializing Player decks");
        
        System.out.println("Press enter to start the game");
        //in.next();
        
        System.out.println(continueGame());
        while (continueGame()) {

        player.play();
        System.out.printf("%s has drawn %s \n", player.getPlayerID(), 
                player.getCard());
        cpu.play();
        System.out.printf("%s has drawn %s \n", cpu.getPlayerID(), 
                cpu.getCard());
        if (winRound(player, cpu)) {
            winner(player, cpu, gameDeck);
            player.getDeck().addCards(gameDeck.showCards().subList(0, 
                    gameDeck.getSize()));
            gameDeck.showCards().clear();
            System.out.println("Player wins round");
        } else if (winRound(cpu, player)) {
            winner(cpu, player, gameDeck);
            cpu.getDeck().addCards(gameDeck.showCards().subList(0, 
                    gameDeck.getSize()));
            gameDeck.showCards().clear();
            System.out.println("CPU wins round");
        } else {
            gameDeck.addCard(player.getCard());
            gameDeck.addCard(cpu.getCard());
            System.out.println("DRAW");
        }
            System.out.printf("player deck: %d winnings: %d \n", player.getDeck().getSize(), player.getWinningsPile().getSize());
            System.out.printf("CPU deck: %d winnings: %d \n", cpu.getDeck().getSize(),  cpu.getWinningsPile().getSize());
            System.out.printf("GAME DECK: %d \n", gameDeck.getSize());
        }
        declareWinner();
    }
}
