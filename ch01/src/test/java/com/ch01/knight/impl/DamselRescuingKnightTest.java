package com.ch01.knight.impl;

import com.ch01.quest.impl.RescueDamselQuest;
import org.junit.Test;

/**
 * 2018/4/29
 *
 * @author restep
 */
public class DamselRescuingKnightTest {
    @Test
    public void embarkOnQuest() {
        DamselRescuingKnight knight = new DamselRescuingKnight(new RescueDamselQuest());
        knight.embarkOnQuest();
    }
}
