package com.ch01.knight.impl;

import com.ch01.knight.Knight;
import com.ch01.quest.impl.RescueDamselQuest;

/**
 * @author restep
 * @date 2018/4/29
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    /**
     * 与RescueDamselQuest紧耦合
     * @param quest
     */
    public DamselRescuingKnight(RescueDamselQuest quest) {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
