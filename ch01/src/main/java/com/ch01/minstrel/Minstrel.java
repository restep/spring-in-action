package com.ch01.minstrel;

import java.io.PrintStream;

/**
 * @author restep
 * @date 2018/4/29
 */
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    /**
     * 探险之前调用
     */
    public void singBeforeQuest() {
        printStream.println("Fa la la, the knight is so brave");
    }

    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight did embark on a quest");
    }
}
