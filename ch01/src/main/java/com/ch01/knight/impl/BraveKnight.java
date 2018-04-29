package com.ch01.knight.impl;

import com.ch01.knight.Knight;
import com.ch01.quest.Quest;

/**
 * 2018/4/29
 *
 * @author restep
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
