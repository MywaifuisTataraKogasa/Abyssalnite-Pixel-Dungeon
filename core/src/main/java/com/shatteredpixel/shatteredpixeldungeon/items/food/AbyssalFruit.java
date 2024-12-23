
package com.shatteredpixel.shatteredpixeldungeon.items.food;

import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;

public class AbyssalFruit extends Food {

    {
        image = ItemSpriteSheet.ABYSSALFRUIT;
        energy = 100f;
        clean = 320f;
    }

    @Override
    public int value() {
        return 20 * quantity;
    }

}
