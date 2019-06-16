package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.extractor.IContentExtractor;
import com.sonalsatpute.etl.extractor.StringContentExtractor;
import com.sonalsatpute.etl.extractor.TextFileContentExtractor;
import com.sonalsatpute.etl.transformer.TitleCaseTransformer;
import com.sonalsatpute.etl.parsar.IContentParser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TitleCaseTransformerTests {

    @Test
    public void Transform_first_letter_of_each_word_into_capital() {
//        String content = "I am a great coder who loves to solve real world problems.";
//        IContentExtractor extractor = new StringContentExtractor(content);
//        IContentParser parser = new TextFileContentExtractor(extractor.contentAsStream(), new TitleCaseTransformer());
//
//        String actual = parser.execute();
//
//        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
//        assertEquals(expected, actual);
    }

    @Test
    public void Transform_multiple_sequential_space_into_single_space() throws IOException {
//        String content = "I am a great coder who loves to solve real world problems.";
//        IContentExtractor extractor = new StringContentExtractor(content);
//        IContentParser parser = new TextFileContentExtractor(extractor.contentAsStream());
//
//
//        String actual = parser.execute();
//
//        String expected = "I Am A Great Coder Who Loves To Solve Real World Problems.";
//        assertEquals(expected, actual);
    }
}

