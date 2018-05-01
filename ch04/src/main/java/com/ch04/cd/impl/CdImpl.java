package com.ch04.cd.impl;

import com.ch04.cd.Cd;
import java.util.List;

/**
 * @author restep
 * @date 2018/4/30
 */
public class CdImpl implements Cd {
    private List<Integer> list;

    @Override
    public void play(int number) {
        System.out.println("播放的是第[" + number + "]首歌");
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
