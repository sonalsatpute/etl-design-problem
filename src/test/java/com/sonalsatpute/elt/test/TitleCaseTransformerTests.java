package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import com.sonalsatpute.etl.parsar.IContentParser;
import com.sonalsatpute.etl.parsar.TextParser;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class TitleCaseTransformerTests {

    @Test
    public void Transform_first_letter_of_each_word_into_capital() throws FileNotFoundException {
        String content = "I am a great coder who loves to solve real world problems.";
        IContentParser parser = new TextParser(content, new TitleCaseTransformer());

        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }

    @Test
    public void Transform_multiple_sequential_space_into_single_space() throws FileNotFoundException {
        String content = "I  am a    great coder who loves to solve  real world problems";
        IContentParser parser = new TextParser(content, new TitleCaseTransformer());

        String actual = parser.execute();

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems";
        assertEquals(expected, actual);
    }
}

