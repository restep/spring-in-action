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

    private CdXmlConfig cdXmlConfig2;

    @Override
    public void play() {
        cdXmlConfig.play();
        cdXmlConfig2.play();
    }

    public void setCdXmlConfig(CdXmlConfig cdXmlConfig) {
        this.cdXmlConfig = cdXmlConfig;
    }

    public void setCdXmlConfig2(CdXmlConfig cdXmlConfig2) {
        this.cdXmlConfig2 = cdXmlConfig2;
    }
}
