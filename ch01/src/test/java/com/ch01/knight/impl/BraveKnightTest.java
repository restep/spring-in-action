package com.ch01.knight.impl;

import com.ch01.quest.Quest;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author restep
 * @date 2018/4/29
 */
public class BraveKnightTest {
    @Test
    public void embarkOnQuest() {
        Quest quest = Mockito.mock(Quest.class);
        BraveKnight knight = new BraveKnight(quest);
        knight.embarkOnQuest();

        Mockito.verify(quest, Mockito.times(1)).embark();
    }
}
