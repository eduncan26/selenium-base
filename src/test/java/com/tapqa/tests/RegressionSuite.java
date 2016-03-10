package com.tapqa.tests;

import com.tapqa.tests.groups.RegressionTests;
import com.tapqa.tests.AppTest;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)
@SuiteClasses({ AppTest.class })
public final class RegressionSuite {}