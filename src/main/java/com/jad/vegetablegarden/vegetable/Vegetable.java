package com.jad.vegetablegarden.vegetable;

public class Vegetable {
    private int maxAge;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private int age;
    private String name;
    private int growingRange;
    private boolean alive;
    private SpriteCell spriteCell;

    protected void die() {
        this.alive = false;
    }

    public void grow() {
        this.age++;
        if (this.age >= this.maxAge) {
            this.die();
        }
    }

    public Vegetable(SpriteCell firstSprite, String name, int maxAge, int growingRange) {
        this.spriteCell = firstSprite;
        this.name = name;
        this.maxAge = maxAge;
        this.growingRange = growingRange;
        this.age = 0;
        this.alive = true;
    }

    private void manageSprite() {
        if (this.age % this.growingRange == 0) {
            this.goNextSprite();
        }
    }

    protected void goNextSprite() {
        if (this.spriteCell.hasNext()){
            this.spriteCell = this.spriteCell.getNext();
        }
    }

    public String getLine(int line) {
        return this.spriteCell.getLine(line);
    }

    public boolean isAlive() {
        return this.alive;
    }


    @Override
    public String toString() {
        return "Vegetable{" +
                "maxAge=" + maxAge +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", growingRange=" + growingRange +
                ", alive=" + alive +
                ", spriteCell=" + spriteCell +
                '}';
    }
}
