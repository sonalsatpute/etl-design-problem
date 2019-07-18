package com.sonalsatpute.etl;

import com.sonalsatpute.etl.extractor.FileContentExtractor;
import com.sonalsatpute.etl.loader.FileContentLoader;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;

public class App {
    private static int SUCCESS = 0;
    private static int FAIL = -1;

    private static int ARGS_COUNT = 2;
    private static int INPUT_INDEX = 0;
    private static int OUTPUT_INDEX = 1;

    public static int main(String[] args) {
        if (args == null){
            System.out.println("missing arguments.");
            return FAIL;
        }
        if (args.length != ARGS_COUNT) {
            System.out.println("Invalid arguments.");
            return FAIL;
        }

        String inputFileId = args[INPUT_INDEX];
        String outputFileId = args[OUTPUT_INDEX];

        IProcessor process = new TextContentProcess(
                new FileContentExtractor(inputFileId),
                new TitleCaseTransformer(),
                new FileContentLoader(outputFileId));

        try {
            process.run();
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }
}
