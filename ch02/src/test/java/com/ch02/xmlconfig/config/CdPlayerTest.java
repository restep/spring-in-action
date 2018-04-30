package com.ch02.xmlconfig.config;

import com.ch02.autoconfig.cd.CdAutoConfig;
import com.ch02.autoconfig.mediaplayer.MediaPlayerAutoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author restep
 * @date 2018/4/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xmlconfig.xml") //加载配置文件
public class CdPlayerTest {
    @Autowired
    private CdAutoConfig compactDisc;

    @Autowired
    private MediaPlayerAutoConfig mediaPlayer;

    @Test
    public void play() {
        mediaPlayer.play();
    }
}
