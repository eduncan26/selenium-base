package com.tapqa.tests.suites;

import com.tapqa.tests.AppTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTests.class)
@Suite.SuiteClasses({ AppTest.class })
public class SmokeTestSuite {}
