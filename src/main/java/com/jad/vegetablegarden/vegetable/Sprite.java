package com.jad.vegetablegarden.vegetable;

import java.util.Arrays;

public class Sprite {

    public final static int WIDTH = 7;
    public static final int HEIGHT = 4;
    private final char[][] chars = new char[Sprite.HEIGHT][Sprite.WIDTH];
    int i=0;
    public Sprite(final String sprite) {
        for (int y = 0; y < Sprite.HEIGHT; y++) {
            for (int x = 0; x < Sprite.WIDTH; x++) {
                this.chars[y][x] = sprite.charAt(y * Sprite.WIDTH + x);
            }
            i++;
        }

    }

    public String getLine(int line) {
        return new String(this.chars[line]);
    }
}