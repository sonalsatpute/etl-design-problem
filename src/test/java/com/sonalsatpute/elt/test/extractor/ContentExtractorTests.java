package com.sonalsatpute.elt.test.extractor;

import com.sonalsatpute.etl.extractor.IContentExtractor;
import com.sonalsatpute.etl.extractor.StringContentExtractor;
import com.sonalsatpute.etl.extractor.TextFileContentExtractor;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class ContentExtractorTests {

    @Test
    public void String_content_extractor_should_convert_string_to_input_stream() throws IOException {
        String content = "I am a great coder who loves to solve real world problems.";
        IContentExtractor reader = new StringContentExtractor();

        InputStream actualInputStream = reader.contentAsStream(content);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(actualInputStream));
        assertEquals(content, bufferedReader.readLine());
    }

    @Test
    public void Text_file_content_extractor_should_convert_string_to_input_stream() throws IOException {
        IContentExtractor reader = new TextFileContentExtractor();

        InputStream actualInputStream = reader.contentAsStream("src/main/resources/input-file.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(actualInputStream));
        String fileContext = "I  am a    great coder who loves to solve  real world problems.";
        assertEquals(fileContext, bufferedReader.readLine());
    }
}
