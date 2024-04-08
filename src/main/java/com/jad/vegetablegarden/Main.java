package com.jad.vegetablegarden;

import com.jad.vegetablegarden.vegetable.Salad;
import com.jad.vegetablegarden.vegetable.Sprite;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConsoleWindow window = new ConsoleWindow("Le jardin de Jad");
        Salad mySalad = new Salad();
        for(;;){
            String strSalad = "";
            for (int i = 0; i < Sprite.HEIGHT; i++) {
                strSalad += mySalad.getLine(i) + "\n";
            }
            window.setScreen(strSalad);
            mySalad.grow();

            window.repaint();
            Thread.sleep(100);
        }
    }
}