package com.tapqa.tests;

import com.tapqa.tests.groups.RegressionTests;
import org.junit.experimental.categories.Category;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest {

    @Test
    @Category(RegressionTests.class)
    public void basicTest() {
        assertTrue(true);
    }

    @Test
    public void anotherTest() {
        assertFalse(false);
    }
}
