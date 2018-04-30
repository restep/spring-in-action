package com.ch02.autoconfig.config;

import com.ch02.autoconfig.cd.CompactDisc;
import com.ch02.autoconfig.cd.MediaPlayer;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author restep
 * @date 2018/4/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CdPlayerConfig.class)
@ContextConfiguration(locations = "classpath:autoconfig.xml") //加载配置文件
public class CdPlayerTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void isCdNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        mediaPlayer.play();
    }
}
