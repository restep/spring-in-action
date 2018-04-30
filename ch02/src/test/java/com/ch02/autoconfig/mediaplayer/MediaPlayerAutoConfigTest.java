package com.ch02.autoconfig.mediaplayer;

import com.ch02.autoconfig.cd.CdAutoConfig;
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
@ContextConfiguration(locations = "classpath:autoconfig.xml")
public class MediaPlayerAutoConfigTest {
    @Autowired
    private MediaPlayerAutoConfig mediaPlayerAutoConfig;

    @Autowired
    private CdAutoConfig cdAutoConfig;

    @Test
    public void isCdNull() {
        assertNotNull(cdAutoConfig);
    }

    @Test
    public void play() {
        mediaPlayerAutoConfig.play();
    }
}
