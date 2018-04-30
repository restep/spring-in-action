package com.ch02.autoconfig.cd.impl;

import com.ch02.autoconfig.cd.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Beatles的歌
 * @author restep
 * @date 2018/4/29
 */
@Component
public class SgtPeppers implements CompactDisc {
    private final String TITLE = "Sgt. Pepper's Lonely Hearts Club Band";
    private final String ARTIST = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing" + TITLE + " by " + ARTIST);
    }
}
