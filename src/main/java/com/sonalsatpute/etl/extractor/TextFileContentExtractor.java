package com.sonalsatpute.etl.extractor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TextFileContentExtractor implements IContentExtractor {
    @Override
    public InputStream contentAsStream(String source) throws FileNotFoundException {
        return new FileInputStream(source);
    }
}
