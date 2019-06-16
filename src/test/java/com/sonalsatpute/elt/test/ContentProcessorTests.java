package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.TextContentProcess;
import com.sonalsatpute.etl.IProcessor;
import com.sonalsatpute.etl.extractor.IContentExtractor;
import com.sonalsatpute.etl.extractor.StringContentExtractor;
import com.sonalsatpute.etl.loader.IContentLoader;
import com.sonalsatpute.etl.loader.StringContentLoader;
import com.sonalsatpute.etl.transformer.ICaseTransformer;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class ContentProcessorTests {
    @Test
    public void Content_processor_should_process_string_content() throws IOException {
        String content = "I am a great coder who loves to solve real world problems.";
        IContentExtractor extractor = new StringContentExtractor(content);

        ICaseTransformer transformer = new TitleCaseTransformer();
        IContentLoader loader = new StringContentLoader();
        IProcessor processor = new TextContentProcess(extractor, transformer, loader);

        processor.run();

        InputStream inputStream = loader.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, bufferedReader.readLine());

        bufferedReader.close();
        inputStream.close();
    }
}
