package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.extractor.IContentExtractor;
import com.sonalsatpute.etl.extractor.StringContentExtractor;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class ContentExtractorTests {

    @Test
    public void String_content_extractor_should_convert_string_to_input_stream() throws IOException {
        String content = "I am a great coder who loves to solve real world problems.";
        IContentExtractor reader = new StringContentExtractor(content);

        InputStream actualInputStream = reader.contentAsStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(actualInputStream));

        assertEquals(content, bufferedReader.readLine());
    }
}
