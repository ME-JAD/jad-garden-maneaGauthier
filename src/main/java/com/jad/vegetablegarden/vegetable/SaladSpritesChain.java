package com.jad.vegetablegarden.vegetable;

enum SaladSpritesChain {
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
                         ╮╭╭ \s
                             \s
                             \s
                       """),
            new Sprite("""
                             \s
                        ╮╮ ╭╭\s
                        ╰╮┴╭╯\s
                             \s
                       """),
            new Sprite("""
                             \s
                       ╮╮╮ ╭╭╭
                       ╰╰╮┴╭╯╯
                             \s
                       """),
            new Sprite("""
                       ╮╮╮ ╭╭╭
                       ╰╮╰│╯╭╯
                       ╰╰╮┴╭╯╯
                             \s
                       """)
    };
    private static SpriteCell firstCell = null;

    static SpriteCell getFirstSprite() {
        if (SaladSpritesChain.firstCell == null) {
            for (Sprite sprite : SaladSpritesChain.SPRITES) {
                if (SaladSpritesChain.firstCell == null) {
                    SaladSpritesChain.firstCell = new SpriteCell(sprite);
                } else {
                    SaladSpritesChain.firstCell.add(sprite);
                }
            }
        }
        return SaladSpritesChain.firstCell;
    }
}
