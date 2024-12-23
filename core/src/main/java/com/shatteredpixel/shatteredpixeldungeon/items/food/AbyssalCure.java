
package com.shatteredpixel.shatteredpixeldungeon.items.food;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.noosa.audio.Sample;

public class AbyssalCure extends Food {

    {
        image = ItemSpriteSheet.ABYSSALCURE;
        energy = 0f;
        clean = 850f;
    }

    @Override
    public int value() {
        return 50 * quantity;
    }

    @Override
    public void execute( Hero hero, String action ) {

        super.execute( hero, action );

        if (action.equals( AC_EAT )) {

            Sample.INSTANCE.play( Assets.Sounds.CURE);

        }
    }
}