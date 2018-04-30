package com.ch02.javaconfig.config;

import com.ch02.javaconfig.cd.CdJavaConfig;
import com.ch02.javaconfig.cd.impl.CdJavaConfigImpl;
import com.ch02.javaconfig.mediaplayer.MediaPlayerJavaConfig;
import com.ch02.javaconfig.mediaplayer.impl.MediaPlayerJavaConfigImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author restep
 * @date 2018/4/30
 */
@Configuration
public class CdConfig {
    /**
     * 以set方式注入
     * @param cdJavaConfig
     * @return
     */
    @Bean
    public MediaPlayerJavaConfig getMediaPlayerJavaConfig(CdJavaConfig cdJavaConfig) {
        MediaPlayerJavaConfigImpl mediaPlayerJavaConfigImpl = new MediaPlayerJavaConfigImpl();
        mediaPlayerJavaConfigImpl.setCdJavaConfig(cdJavaConfig);

        return mediaPlayerJavaConfigImpl;
    }

    @Bean
    public CdJavaConfig getCdJavaConfig() {
        return new CdJavaConfigImpl();
    }
}
