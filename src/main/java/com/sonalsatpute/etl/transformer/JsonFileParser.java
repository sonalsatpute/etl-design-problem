package com.sonalsatpute.etl.transformer;

import com.sonalsatpute.etl.parsar.IContentParser;

import java.io.FileNotFoundException;

public class JsonFileParser implements IContentParser {
    private final String fileId;
    private final ICaseTransformer transformer;

    public JsonFileParser(String fileId, ICaseTransformer transformer) {
        this.fileId = fileId;
        this.transformer = transformer;
    }

    @Override
    public String execute() throws FileNotFoundException {
        return null;
    }
}
