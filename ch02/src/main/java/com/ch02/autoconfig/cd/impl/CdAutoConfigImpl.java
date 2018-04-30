package com.ch02.autoconfig.cd.impl;

import com.ch02.autoconfig.cd.CdAutoConfig;
import org.springframework.stereotype.Component;

/**
 * CD实现类
 * @author restep
 * @date 2018/4/29
 */
@Component
public class CdAutoConfigImpl implements CdAutoConfig {
    @Override
    public void play() {
        System.out.println("com.ch02.autoconfig.cd.impl.CdAutoConfigImpl#play");
    }
}
