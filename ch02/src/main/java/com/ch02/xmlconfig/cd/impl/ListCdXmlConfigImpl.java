package com.ch02.xmlconfig.cd.impl;

import com.ch02.xmlconfig.cd.CdXmlConfig;

import java.util.List;

/**
 * @author restep
 * @date 2018/4/30
 */
public class ListCdXmlConfigImpl implements CdXmlConfig {
    private List<String> list;

    @Override
    public void play() {
        System.out.println("com.ch02.xmlconfig.cd.impl.ListCdXmlConfigImpl#play");
        System.out.println("list: " + list);
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
