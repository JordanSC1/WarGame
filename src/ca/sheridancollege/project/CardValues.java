/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author jrgra
 */
public enum CardValues {
    ACE(1,"Ace"),
    TWO(2,"Two"),
    THREE(3,"Three"),
    FOUR(4,"Four"),
    FIVE(5,"Five"),
    SIX(6,"Six"),
    SEVEN(7,"Seven"),
    EIGHT(8,"Eight"),
    NINE(9,"Nine"),
    TEN(10,"Ten"),
    JACK(11,"Jack"),
    QUEEN(12,"Queen"),
    KING(13,"King");

    private final int val;
    private final String name;

    private CardValues(int val, String name){
        this.val = val;
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }
}