package com.jad.vegetablegarden;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * The type Game window.
 */
class ConsoleWindow extends JFrame {
    private static final InputStream FONT_FILE_PATH = ConsoleWindow.class.getResourceAsStream("/CascadiaMono.ttf");
    private static final float FONT_SIZE = 9f;
    private final JTextArea screen = new JTextArea("");

    /**
     * Instantiates a new Game window.
     */
    public ConsoleWindow(final String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.buildScreen();
        this.setVisible(true);
    }

    private void buildScreen() {
        this.setLayout(new BorderLayout());
        this.screen.setFont(ConsoleWindow.makeFont());
        this.screen.setEditable(false);
        this.add(this.screen, BorderLayout.CENTER);
    }

    private static Font makeFont() {
        Font font;
        try {
            assert ConsoleWindow.FONT_FILE_PATH != null;
            font = Font.createFont(Font.TRUETYPE_FONT, ConsoleWindow.FONT_FILE_PATH);
        } catch (final FontFormatException | IOException exception) {
            throw new RuntimeException(exception);
        }
        font = font.deriveFont(ConsoleWindow.FONT_SIZE);
        return font;
    }

    /**
     * Sets screen.
     *
     * @param screen the screen
     */
    public void setScreen(final String screen) {
        this.screen.setText(screen);
    }
}
