package com.tech.springWithElastic.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@Component
public class LongToLocalDateTimeConverter implements Converter<Long, LocalDateTime> {
    @Override
    public LocalDateTime convert(Long source) {
        return source != null ? LocalDateTime.ofInstant(Instant.ofEpochMilli(source), ZoneId.systemDefault()) : null;
    }
}