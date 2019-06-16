package com.sonalsatpute.etl.extractor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class StringContentExtractor implements IContentExtractor {
    private final String content;

    public StringContentExtractor(String content) {
        this.content = content;
    }

    @Override
    public InputStream getInputStream() {
        return new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
    }
}
