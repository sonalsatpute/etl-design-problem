package com.sonalsatpute.etl.transformer;

import com.sonalsatpute.etl.parsar.IContentParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileParser implements IContentParser {
    private final String fileId;
    private final ICaseTransformer transformer;

    public TextFileParser(String fileId, ICaseTransformer transformer) {
        this.fileId = fileId;
        this.transformer = transformer;
    }

    @Override
    public String execute() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileId));
        return  transformer.process(scanner.nextLine());
//        while (scanner.hasNextLine()) {
//
//        }
    }
}
