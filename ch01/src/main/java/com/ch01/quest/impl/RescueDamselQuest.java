package com.ch01.quest.impl;

import com.ch01.quest.Quest;

/**
 * 2018/4/29
 *
 * @author restep
 */
public class RescueDamselQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Embarking on a quest to rescue the damsel");
    }
}
