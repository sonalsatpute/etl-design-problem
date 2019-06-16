package com.sonalsatpute.etl.parsar;

import com.sonalsatpute.etl.transformer.ICaseTransformer;

import java.io.InputStream;
import java.util.Scanner;

public class JsonFileParser implements IContentParser {
    private InputStream inputStream;
    private final ICaseTransformer transformer;

    public JsonFileParser(InputStream inputStream, ICaseTransformer transformer) {
        this.inputStream = inputStream;
        this.transformer = transformer;
    }

    @Override
    public String execute(){
        Scanner scanner = new Scanner(inputStream);
        return null;
    }
}
