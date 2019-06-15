package com.sonalsatpute.etl.parsar;
import com.sonalsatpute.etl.transformer.ICaseTransformer;

import java.io.InputStream;
import java.util.Scanner;

public class TextContentParser implements IContentParser {
    private final InputStream inputStream;
    private final ICaseTransformer transformer;

    public TextContentParser(InputStream inputStream, ICaseTransformer transformer) {
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
