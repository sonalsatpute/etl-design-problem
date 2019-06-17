package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.app;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EnvironmentalTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void Main_should_return_success() {
        String[] args = new String[]{
                "src/main/resources/input-file.txt",
                "src/main/resources/output-file.txt"
        };
        assertEquals(0, app.main(args));
    }

    @Test
    public void Main_should_return_negative_one_if_args_parameter_is_less_than_three() {
        assertEquals(-1, app.main(null));
    }

    @Test
    public void Main_should_return_negative_one_when_files_not_found() {
        String[] args = new String[]{
                "src/main/resources/not-fount-input-file.txt",
                "src/main/resources/not_found_output-file.txt"
        };
        assertEquals(-1, app.main(args));
    }
}
