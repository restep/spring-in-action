package com.ch02.xmlconfig.mediaplayer;

import com.ch02.xmlconfig.cd.CdXmlConfig;
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
@ContextConfiguration(locations = "classpath:xmlconfig.xml")
public class MediaPlayerXmlConfigTest {
    @Autowired
    private MediaPlayerXmlConfig mediaPlayerXmlConfig;

    @Autowired
    private CdXmlConfig cdXmlConfig;


    @Test
    public void isCdNull() {
        assertNotNull(cdXmlConfig);
    }

    @Test
    public void play() {
        mediaPlayerXmlConfig.play();
    }
}
