package com.ch02.xmlconfig.mediaplayer.impl;

import com.ch02.xmlconfig.cd.CdXmlConfig;
import com.ch02.xmlconfig.mediaplayer.MediaPlayerXmlConfig;

/**
 * 播放机接口实现类
 * @author restep
 * @date 2018/4/30
 */
public class MediaPlayerXmlConfigImpl implements MediaPlayerXmlConfig {
    private CdXmlConfig cdXmlConfig;

    @Override
    public void play() {
        cdXmlConfig.play();
    }

    public void setCdXmlConfig(CdXmlConfig cdXmlConfig) {
        this.cdXmlConfig = cdXmlConfig;
    }
}
