package com.ch02.autoconfig.mediaplayer.impl;

import com.ch02.autoconfig.cd.CdAutoConfig;
import com.ch02.autoconfig.mediaplayer.MediaPlayerAutoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 播放机接口
 * @author restep
 * @date 2018/4/30
 */
@Component
public class MediaPlayerAutoConfigImpl implements MediaPlayerAutoConfig {
    /**
     * CD接口
     */
    @Autowired
    private CdAutoConfig cdAutoConfig;

    @Override
    public void play() {
        cdAutoConfig.play();
    }
}
