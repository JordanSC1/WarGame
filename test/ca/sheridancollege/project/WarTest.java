/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        
        War.player = new WarPlayer("p1");
        War.cpu = new WarPlayer("p2");
        boolean expResult = true;
        Card card1 = new PokerCard(12, 1);
        War.player.getDeck().addCard(card1);
        War.player.play();
        Card card2 = new PokerCard(10, 1);
        War.cpu.getDeck().addCard(card2);
        War.cpu.play();
        boolean result = War.winRound(War.player, War.cpu);
        assertEquals(expResult, result);
    }
    
    @Test    
    public void testWinRoundBad() {
        
        War.player = new WarPlayer("p1");
        War.cpu = new WarPlayer("p2");
        boolean expResult = false;
        Card card1 = new PokerCard(3, 1);
        War.player.getDeck().addCard(card1);
        War.player.play();
        Card card2 = new PokerCard(10, 1);
        War.cpu.getDeck().addCard(card2);
        War.cpu.play();
        boolean result = War.winRound(War.player, War.cpu);
        assertEquals(expResult, result);
    }
    
    @Test  
    public void testWinRoundBoundary() {
        
        War.player = new WarPlayer("p1");
        War.cpu = new WarPlayer("p2");
        boolean expResult = true;
        Card card1 = new PokerCard(6, 1);
        War.player.getDeck().addCard(card1);
        War.player.play();
        Card card2 = new PokerCard(1, 1);
        War.cpu.getDeck().addCard(card2);
        War.cpu.play();
        boolean result = War.winRound(War.player, War.cpu);
        assertEquals(expResult, result);
    }
  
}