package com.sonalsatpute.elt.transformer.tests;

import com.sonalsatpute.etl.transformer.ICaseTransformer;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitleCaseTransformerTests {

    @Test
    public void Title_case_transformer_should_convert_first_letter_of_all_the_words_to_capital_letter() {
        String content = "I am a great coder who loves to solve real world problems.";
        ICaseTransformer transformer = new TitleCaseTransformer();

        String actual = transformer.process(content);

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }

    @Test
    public void Title_case_transformer_should_replace_multiple_sequential_space_with_single_space() {
        String content = "I    am a great     coder who loves    to solve   real world problems.";
        ICaseTransformer transformer = new TitleCaseTransformer();

        String actual = transformer.process(content);

        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
        assertEquals(expected, actual);
    }
}

