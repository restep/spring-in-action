package com.ch02.javaconfig.cd.impl;

import com.ch02.javaconfig.cd.CdJavaConfig;

/**
 * CD接口实现类
 * @author restep
 * @date 2018/4/30
 */
public class CdJavaConfigImpl implements CdJavaConfig {
    @Override
    public void play() {
        System.out.println("com.ch02.javaconfig.cd.impl.CdJavaConfigImpl#play");
    }
}
