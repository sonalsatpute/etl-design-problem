package com.sonalsatpute.etl.extractor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class StringContentExtractor implements IContentExtractor {
    @Override
    public InputStream contentAsStream(String source) {
        return new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
    }
}
