package com.sonalsatpute.etl;

import com.sonalsatpute.etl.extractor.IContentExtractor;
import com.sonalsatpute.etl.extractor.StringContentExtractor;
import com.sonalsatpute.etl.loader.IContentLoader;
import com.sonalsatpute.etl.transformer.ICaseTransformer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextContentProcess implements IProcessor {
    private final IContentExtractor extractor;
    private final ICaseTransformer transformer;
    private final IContentLoader loader;

    public TextContentProcess(IContentExtractor extractor, ICaseTransformer transformer, IContentLoader loader) {
        this.extractor = extractor;
        this.transformer = transformer;
        this.loader = loader;
    }

    @Override
    public void run() throws IOException {
        InputStream inputStream = this.extractor.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(bufferedReader);
        if(scanner.hasNextLine())
        {
            String content = this.transformer.process(scanner.nextLine());
            this.loader.write(new StringContentExtractor(content).getInputStream());
        }
    }
}
