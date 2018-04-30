package com.ch02.javaconfig.mediaplayer.impl;

import com.ch02.javaconfig.cd.CdJavaConfig;
import com.ch02.javaconfig.mediaplayer.MediaPlayerJavaConfig;

/**
 * 播放机实现类
 * @author restep
 * @date 2018/4/30
 */
public class MediaPlayerJavaConfigImpl implements MediaPlayerJavaConfig {
    /**
     * CD接口
     */
    private CdJavaConfig cdJavaConfig;

    @Override
    public void play() {
        cdJavaConfig.play();
    }

    public void setCdJavaConfig(CdJavaConfig cdJavaConfig) {
        this.cdJavaConfig = cdJavaConfig;
    }
}
