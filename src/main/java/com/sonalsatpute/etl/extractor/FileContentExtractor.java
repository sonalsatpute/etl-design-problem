package com.sonalsatpute.etl.extractor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileContentExtractor implements IContentExtractor {
    private final String fileId;

    public FileContentExtractor(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream(fileId);
    }
}
