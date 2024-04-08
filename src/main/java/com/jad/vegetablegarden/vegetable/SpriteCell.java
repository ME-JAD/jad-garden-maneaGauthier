package com.jad.vegetablegarden.vegetable;

import java.util.Arrays;

class SpriteCell {
    private final Sprite sprite;
    private SpriteCell next;

    public SpriteCell(final Sprite sprite) {
        this.sprite = sprite;
        this.next = null;
    }

    public void add(Sprite sprite) {
        if (this.hasNext()){
            this.next.add(sprite);
        } else {
            this.next = new SpriteCell(sprite);
        }

    }

    public String getLine(int line) {
        return this.sprite.getLine(line);
    }

    public SpriteCell getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this.next != null;
    }
}