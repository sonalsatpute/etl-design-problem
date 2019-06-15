package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.parsar.IContentParser;
import com.sonalsatpute.etl.parsar.TextContentParser;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ParserTests {
    @Test
    public void Text_file_parser_should_parse_the_content_of_file() throws FileNotFoundException {
        InputStream inputstream = new FileInputStream("src/main/resources/input-file.txt");
        IContentParser parser = new TextContentParser(inputstream, new TitleCaseTransformer());

        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }

    @Test
    public void Json_file_parser_should_parse_the_content_of_file() {
//        IContentParser parser = new JsonFileParser("src/main/resources/input-file.json", new TitleCaseTransformer());
//
//        String actual = parser.execute();
//
//        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
//        assertEquals(expected, actual);
    }
}
