package com.tech.springWithElastic.config;

import com.tech.springWithElastic.util.LongToLocalDateTimeConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
public class AppConfig {
    @Bean
    public GenericConversionService conversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverter(new LongToLocalDateTimeConverter());
        return conversionService;
    }
}