package com.ch04.track;

import com.ch04.cd.Cd;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author restep
 * @date 2018/5/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:track.xml")
public class TrackTest {
    @Autowired
    private Cd cd;

    @Autowired
    private Track track;

    @Test
    public void countTrack() {
        cd.play(1);

        cd.play(2);

        cd.play(3);
        cd.play(3);
        cd.play(3);
        cd.play(3);

        assertEquals(1, track.getPlayCount(1));
        assertEquals(1, track.getPlayCount(2));
        assertEquals(4, track.getPlayCount(3));
        assertEquals(0, track.getPlayCount(4));
    }
}
