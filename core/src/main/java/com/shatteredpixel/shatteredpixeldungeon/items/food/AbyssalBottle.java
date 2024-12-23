
package com.shatteredpixel.shatteredpixeldungeon.items.food;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.noosa.audio.Sample;

public class AbyssalBottle extends Food {

    {
        image = ItemSpriteSheet.ABYSSALBOTTLE;
        energy = 0f;
        clean = 380f;
    }

    @Override
    public void execute( Hero hero, String action ) {

        super.execute( hero, action );

        if (action.equals( AC_EAT )) {

            Sample.INSTANCE.play( Assets.Sounds.CURE);

        }
    }
}