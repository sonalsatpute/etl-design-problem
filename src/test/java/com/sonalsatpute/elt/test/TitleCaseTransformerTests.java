package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.parsar.TextContentParser;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import com.sonalsatpute.etl.parsar.IContentParser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class TitleCaseTransformerTests {

    @Test
    public void Transform_first_letter_of_each_word_into_capital() {
        String content = "I am a great coder who loves to solve real world problems.";
        InputStream inputStream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));

        IContentParser parser = new TextContentParser(inputStream, new TitleCaseTransformer());

        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }

    @Test
    public void Transform_multiple_sequential_space_into_single_space() {
        String content = "I  am a    great coder who loves to solve  real world problems";
        InputStream inputStream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));

        IContentParser parser = new TextContentParser(inputStream, new TitleCaseTransformer());


        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems";
        assertEquals(expected, actual);
    }
}

