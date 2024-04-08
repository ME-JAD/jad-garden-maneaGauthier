package com.jad.vegetablegarden.vegetable;

enum TomatoSpritesChain {
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
                        ╭───╮\s
                        ╰───╯\s
                             \s
                       """),
            new Sprite("""
                             \s
                        ╭╮╭╭╮\s
                        ╰───╯\s
                             \s
                       """),
            new Sprite("""
                             \s
                       ╭─╮╭╭─╮
                       ╰─────╯
                             \s
                       """),
            new Sprite("""
                       ╭─╮╭╭─╮
                       │ ╰┴╯ │
                       ╰╮   ╭╯
                        ╰───╯\s
                       """),
            new Sprite("""
                       ╭─╮╭╭─╮
                       │ ╰┴╯ │
                       │     │
                       ╰─────╯
                       """)
    };
    private static SpriteCell firstCell = null;

    static SpriteCell getFirstCell() {
        if (TomatoSpritesChain.firstCell == null) {
            for (Sprite sprite : TomatoSpritesChain.SPRITES) {
                if (TomatoSpritesChain.firstCell == null) {
                    TomatoSpritesChain.firstCell = new SpriteCell(sprite);
                } else {
                    TomatoSpritesChain.firstCell.add(sprite);
                }
            }
        }
        return TomatoSpritesChain.firstCell;
    }
}
