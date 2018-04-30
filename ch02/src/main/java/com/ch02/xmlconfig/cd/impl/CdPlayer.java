package com.ch02.xmlconfig.cd.impl;

import com.ch02.autoconfig.cd.CdAutoConfig;
import com.ch02.xmlconfig.cd.MediaPlayer;

/**
 * @author restep
 * @date 2018/4/30
 */
public class CdPlayer implements MediaPlayer {
    private CdAutoConfig compactDisc;

    public CdPlayer(CdAutoConfig compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
