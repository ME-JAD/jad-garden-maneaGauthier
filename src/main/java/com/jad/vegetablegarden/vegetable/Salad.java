package com.jad.vegetablegarden.vegetable;

public class Salad extends Vegetable{
    public static final int MAX_AGE = 45;

    public Salad() {
        super(SaladSpritesChain.getFirstSprite(), "Salad", Salad.MAX_AGE, Salad.MAX_AGE / SaladSpritesChain.SPRITES.length);
    }
}
