package com.sonalsatpute.etl;

import com.sonalsatpute.etl.extractor.FileContentExtractor;
import com.sonalsatpute.etl.loader.FileContentLoader;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;

import java.io.IOException;

public class app {
    public static void main(String[] args) {
        String inputFileId = "src/main/resources/input-file.txt";
        String outputFileId = "src/main/resources/output-file.txt";

        TextContentProcess process = new TextContentProcess(
                new FileContentExtractor(inputFileId),
                new TitleCaseTransformer(),
                new FileContentLoader(outputFileId));

        try {
            process.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
