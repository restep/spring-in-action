package com.ch01.quest.impl;

import com.ch01.quest.Quest;

import java.io.PrintStream;

/**
 * @author restep
 * @date 2018/4/29
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon");
    }
}
