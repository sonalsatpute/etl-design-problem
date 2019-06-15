package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.parsar.IContentParser;
import com.sonalsatpute.etl.transformer.JsonFileParser;
import com.sonalsatpute.etl.transformer.TextFileParser;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class TextFileParserTests {
    @Test
    public void Text_file_parser_should_parse_the_content_of_file() throws FileNotFoundException {
        IContentParser parser = new TextFileParser("src/main/resources/input-file.txt", new TitleCaseTransformer());

        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }

    @Test
    public void Json_file_parser_should_parse_the_content_of_file() throws FileNotFoundException {
        IContentParser parser = new JsonFileParser("src/main/resources/input-file.txt", new TitleCaseTransformer());

        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }
}
