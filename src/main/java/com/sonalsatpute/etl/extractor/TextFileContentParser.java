package com.sonalsatpute.etl.extractor;

import com.sonalsatpute.etl.parsar.IContentParser;
import com.sonalsatpute.etl.transformer.ICaseTransformer;

import java.io.InputStream;
import java.util.Scanner;

public class TextFileContentParser implements IContentParser {
    private final InputStream inputStream;
    private final ICaseTransformer transformer;

    public TextFileContentParser(InputStream inputStream, ICaseTransformer transformer) {
        this.inputStream = inputStream;
        this.transformer = transformer;
    }

    @Override
    public String execute() {
        Scanner scanner = new Scanner(inputStream);
        return  transformer.process(scanner.nextLine());
        //        while (scanner.hasNextLine()) {
        //
        //        }
    }
}
