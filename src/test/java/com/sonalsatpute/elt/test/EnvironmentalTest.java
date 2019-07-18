package com.sonalsatpute.elt.test;

import com.sonalsatpute.etl.App;
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
        assertEquals(0, App.main(args));
    }

    @Test
    public void Main_should_return_negative_one_when_args_is_null() {
        assertEquals(-1, App.main(null));
    }

    @Test
    public void Main_should_return_negative_one_if_args_parameter_is_less_than_two() {
        String[] args = new String[]{
                "src/main/resources/not-fount-input-file.txt"
        };
        assertEquals(-1, App.main(args));
    }

    @Test
    public void Main_should_return_negative_one_when_files_not_found() {
        String[] args = new String[]{
                "src/main/resources/not-fount-input-file.txt",
                "src/main/resources/not_found_output-file.txt"
        };
        assertEquals(-1, App.main(args));
    }


}
