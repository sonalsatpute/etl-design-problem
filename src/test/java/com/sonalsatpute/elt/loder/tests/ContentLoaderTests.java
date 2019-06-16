package com.sonalsatpute.elt.loder.tests;

import com.sonalsatpute.etl.extractor.StringContentExtractor;
import com.sonalsatpute.etl.loader.FileContentLoader;
import com.sonalsatpute.etl.loader.IContentLoader;
import com.sonalsatpute.etl.loader.StringContentLoader;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class ContentLoaderTests {
    @Test
    public void String_content_should_load() throws IOException {
        String content = "I am a great coder who loves to solve real world problems.";
        IContentLoader loader = new StringContentLoader();
        loader.write(new StringContentExtractor(content).getInputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(loader.getInputStream(), StandardCharsets.UTF_8));
        assertEquals(content, bufferedReader.readLine());
    }

    @Test
    public void Text_file_content_should_load() throws IOException {
        String fileId = "src/main/resources/output-file.txt";
        String content = "I am a great coder who loves to solve real world problems.";
        IContentLoader loader = new FileContentLoader(fileId);

        loader.write(new StringContentExtractor(content).getInputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(loader.getInputStream(), StandardCharsets.UTF_8));
        assertEquals(content, bufferedReader.readLine());
    }

}
