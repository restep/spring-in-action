package com.ch09.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

/**
 * @author restep
 * @date 2018/6/3
 */
@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = {"com.ch09"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("com\\.ch09\\.web"));
        }
    }
}
