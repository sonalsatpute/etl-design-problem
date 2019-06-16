package com.sonalsatpute.elt.extractor.tests;

import com.sonalsatpute.etl.extractor.IContentExtractor;
import com.sonalsatpute.etl.extractor.StringContentExtractor;
import com.sonalsatpute.etl.extractor.FileContentExtractor;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class ContentExtractorTests {

    @Test
    public void String_content_extractor_should_convert_string_to_input_stream() throws IOException {
        String content = "I am a great coder who loves to solve real world problems.";
        IContentExtractor extractor = new StringContentExtractor(content);

        InputStream actualInputStream = extractor.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(actualInputStream, StandardCharsets.UTF_8));
        assertEquals(content, bufferedReader.readLine());

        actualInputStream.close();
        bufferedReader.close();
    }

    @Test
    public void File_content_extractor_should_convert_content_to_input_stream() throws IOException {
        String fileId = "src/main/resources/input-file.txt";
        IContentExtractor extractor = new FileContentExtractor(fileId);

        InputStream actualInputStream = extractor.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(actualInputStream));
        String expectedFileContent = "I  am a    great coder who loves to solve  real world problems.";
        assertEquals(expectedFileContent, bufferedReader.readLine());

        actualInputStream.close();
        bufferedReader.close();
    }
}
