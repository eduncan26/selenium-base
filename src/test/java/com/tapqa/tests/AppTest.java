package com.tapqa.tests;

import com.tapqa.tests.suites.RegressionTests;
import org.junit.experimental.categories.Category;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class AppTest extends BaseTest {

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
