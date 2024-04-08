package com.jad.vegetablegarden.vegetable;

enum CucumberSpritesChain {
    ;
    public static final Sprite[] SPRITES = {
            new Sprite("""
                             \s
                             \s
                             \s
                             \s
                       """),
            new Sprite("""
                             \s
                          ╭  \s
                             \s
                             \s
                       """),
            new Sprite("""
                             \s
                         ╭─╮ \s
                         ╰─╯ \s
                             \s
                       """),
            new Sprite("""
                             \s
                          ╭─╮\s
                         ╭╯╭╯\s
                         ╰─╯ \s
                       """),
            new Sprite("""
                             \s
                         ╭──╮\s
                        ╭╯ ╭╯\s
                        ╰──╯ \s
                       """),
            new Sprite("""
                         ╭──╮\s
                        ╭╯ ╭╯\s
                       ╭╯ ╭╯ \s
                       ╰──╯  \s
                       """),
            new Sprite("""
                         ╭───╮
                        ╭╯  ╭╯
                       ╭╯  ╭╯\s
                       ╰───╯ \s
                       """),
            new Sprite("""
                         ╭───╮
                        ╭╯ ╱╭╯
                       ╭╯╱ ╭╯\s
                       ╰───╯ \s
                       """),
            new Sprite("""
                         ╭───╮
                        ╭╯╱╱╭╯
                       ╭╯╱╱╭╯\s
                       ╰───╯ \s
                       """)
    };
    private static SpriteCell firstCell = null;

    static SpriteCell getFirstCell() {
        if (CucumberSpritesChain.firstCell == null) {
            for (Sprite sprite : CucumberSpritesChain.SPRITES) {
                if (CucumberSpritesChain.firstCell == null) {
                    CucumberSpritesChain.firstCell = new SpriteCell(sprite);
                } else {
                    CucumberSpritesChain.firstCell.add(sprite);
                }
            }
        }
        return CucumberSpritesChain.firstCell;
    }
}
