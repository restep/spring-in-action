package com.ch02.javaconfig.config;

import com.ch02.javaconfig.cd.CdJavaConfig;
import com.ch02.javaconfig.mediaplayer.MediaPlayerJavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author restep
 * @date 2018/4/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdConfig.class)
public class MediaPlayerJavaConfigTest {
    @Autowired
    private MediaPlayerJavaConfig mediaPlayerJavaConfig;

    @Autowired
    private CdJavaConfig cdJavaConfig;

    @Test
    public void isCdNull() {
        assertNotNull(cdJavaConfig);
    }

    @Test
    public void play() {
        mediaPlayerJavaConfig.play();
    }
}
