/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author shihu
 */
public class WarTest {
    
    public WarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

@Test
        
    public void testWinRoundGood() {
        
        WarPlayer p1 = new WarPlayer("p1");
        WarPlayer p2 = new WarPlayer("p2");
        boolean expResult = true;
        Card card1 = new PokerCard(13, 1);
        p1.clearCard();
        p1.cardInPlay.addCard(card1);
        Card card2 = new PokerCard(10, 1);
        p2.clearCard();
        p2.cardInPlay.addCard(card2);
        War tWRG = new War("tWRB");
        boolean result = tWRG.winRound(p1, p2);
        assertEquals(expResult, result);
    }
    
    @Test
        
    public void testWinRoundBad() {
        
        WarPlayer p1 = new WarPlayer("p1");
        WarPlayer p2 = new WarPlayer("p2");
        boolean expResult = false;
        Card card1 = new PokerCard(3, 1);
        p1.clearCard();
        p1.cardInPlay.addCard(card1);
        Card card2 = new PokerCard(10, 1);
        p2.clearCard();
        p2.cardInPlay.addCard(card2);
        War tWRB = new War("tWRB");
        boolean result = tWRB.winRound(p1, p2);
        assertEquals(expResult, result);
    }
    
@Test
        
    public void testWinRoundBoundary() {
        
        WarPlayer p1 = new WarPlayer("p1");
        WarPlayer p2 = new WarPlayer("p2");
        boolean expResult = true;
        Card card1 = new PokerCard(6, 1);
        p1.clearCard();
        p1.cardInPlay.addCard(card1);
        Card card2 = new PokerCard(14, 1);
        p2.clearCard();
        p2.cardInPlay.addCard(card2);
        War tWRB = new War("tWRB");
        boolean result = tWRB.winRound(p1, p2);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testWinRoundGeneralGood() {    
        WarPlayer p1 = new WarPlayer("");
        WarPlayer p2 = new WarPlayer("");      
       boolean expResult = false;
       War tWRB = new War("");
        boolean result = tWRB.winRound(p1, p2);
        if (result) {
                expResult = true;
        } else if ((p1.getCard().getCardValue() > p2.getCard().getCardValue()) || ((p1.getCard().getCardValue() == 6) && (p2.getCard().getCardValue() == 14)) || ((p1.getCard().getCardValue() ==14)&&(p2.getCard().getCardValue()!=6))){
                expResult = true;
            }
        assertEquals(expResult, result);
    }



  
}