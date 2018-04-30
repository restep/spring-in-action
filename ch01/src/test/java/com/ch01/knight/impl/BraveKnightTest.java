package com.ch01.knight.impl;

import com.ch01.quest.Quest;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * @author restep
 * @date 2018/4/29
 */
public class BraveKnightTest {
    @Test
    public void embarkOnQuest() {
        Quest quest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(quest);
        knight.embarkOnQuest();

        verify(quest, times(1)).embark();
    }
}
