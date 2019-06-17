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
    public void main_should_return_success() {
        app app = new app();
        assertEquals(0, app.main(null));
    }
}
