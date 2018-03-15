package edu.ucsb.cs56.projects.android.conversion_showdown.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Modified by Claudia Zeng and Kerry Mo on 02/25/2018. This class contains three simple test cases
 * that each is given two number with an operation and check if it matches the expected value.
 * Run the test simply by right clicking the test in Project display and select “Run ‘ExampleUnitTest’”,
 * then just wait for the test result.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    // Add More Tests, KM/CZ 03/12/2018
    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(0, 2 - 2);
    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        assertEquals(4, 2 * 2);
    }

}