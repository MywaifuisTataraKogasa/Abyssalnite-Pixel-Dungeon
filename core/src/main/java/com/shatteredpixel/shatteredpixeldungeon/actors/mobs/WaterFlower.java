package com.shatteredpixel.shatteredpixeldungeon.actors.mobs;

import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import com.shatteredpixel.shatteredpixeldungeon.actors.Char;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Buff;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Healing;
import com.shatteredpixel.shatteredpixeldungeon.sprites.LotusSprite;
import com.watabou.utils.Random;

public class WaterFlower extends Mob {

    {
        spriteClass = LotusSprite.class;

        HP = HT = 55;
        defenseSkill = 13;

        EXP = 20;
        maxLvl = -2;


        properties.add(Property.DEMONIC);

        HUNTING = new Hunting();
    }



    @Override
    public int damageRoll() {
        return Random.NormalIntRange(15, 20);
    }

    @Override
    public int attackSkill( Char target ) {
        return 25;
    }

    @Override
    public int drRoll() {
        return Random.NormalIntRange(0, 5);
    }

    private void healSubject(){
        for (Mob mob : Dungeon.level.mobs.toArray(new Mob[0])){
            if(Dungeon.level.distance( pos, mob.pos ) <= 3 || mob.HP < mob.HT){
                Buff.affect(mob, Healing.class).setHeal(9, 0, 3);
            }
        }
    }

    @Override
    public int attackProc( Char enemy, int damage ) {
        damage = super.attackProc( enemy, damage );
        healSubject();
        return damage;
    }






}
