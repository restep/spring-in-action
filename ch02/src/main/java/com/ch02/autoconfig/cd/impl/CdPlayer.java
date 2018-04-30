package com.ch02.autoconfig.cd.impl;

import com.ch02.autoconfig.cd.CompactDisc;
import com.ch02.autoconfig.cd.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author restep
 * @date 2018/4/30
 */
@Component
public class CdPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    /**
     * Autowired注解不仅能够用在构造器上 还能用在属性的setter方法上
     * @param compactDisc
     */
    @Autowired
    public CdPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
