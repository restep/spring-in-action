package com.ch02.xmlconfig.cd.impl;

import com.ch02.xmlconfig.cd.CdXmlConfig;

/**
 * @author restep
 * @date 2018/4/30
 */
public class BlankCdXmlConfigImpl implements CdXmlConfig {
    private String title;
    private String artist;

    @Override
    public void play() {
        System.out.println("com.ch02.xmlconfig.cd.impl.BlankCdXmlConfigImpl#play");
        System.out.println("title: " + title);
        System.out.println("artist: " + artist);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
