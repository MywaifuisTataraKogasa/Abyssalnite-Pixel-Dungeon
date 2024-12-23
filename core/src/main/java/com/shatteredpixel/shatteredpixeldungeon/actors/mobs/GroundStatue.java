package com.shatteredpixel.shatteredpixeldungeon.actors.mobs;

import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.sprites.StatueSprite;
import com.watabou.utils.Random;

public class GroundStatue extends Mob {

    {
        spriteClass = StatueSprite.class;

        HP = HT = 10;
        defenseSkill = 1;

        EXP = 25;
        maxLvl = -2;


        properties.add(Property.DEMONIC);
        properties.add(Property.LARGE);

        WANDERING = new Wandering();
        HUNTING = new Hunting();
    }


    @Override
    public int damageRoll() {
        return Random.NormalIntRange( 35, 45 );
    }

    @Override
    public int attackSkill( Char target ) {
        return 50;
    }

    @Override
    public int drRoll() {
        return Random.NormalIntRange(80, 100);
    }



}