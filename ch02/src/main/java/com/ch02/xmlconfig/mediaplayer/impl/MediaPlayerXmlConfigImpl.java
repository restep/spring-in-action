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

    private CdXmlConfig blankCdXmlConfig;

    private CdXmlConfig listCdXmlConfig;

    @Override
    public void play() {
        cdXmlConfig.play();
        blankCdXmlConfig.play();
        listCdXmlConfig.play();
    }

    public void setCdXmlConfig(CdXmlConfig cdXmlConfig) {
        this.cdXmlConfig = cdXmlConfig;
    }

    public void setBlankCdXmlConfig(CdXmlConfig blankCdXmlConfig) {
        this.blankCdXmlConfig = blankCdXmlConfig;
    }

    public void setListCdXmlConfig(CdXmlConfig listCdXmlConfig) {
        this.listCdXmlConfig = listCdXmlConfig;
    }
}
