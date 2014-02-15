package _3grouping.grouping.categories.suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import _3grouping.grouping.CalculatorDivideTest;
import _3grouping.grouping.CalculatorSqrtTest;
import _3grouping.grouping.categories.BasicCases;
import _3grouping.grouping.categories.ExceptionalCases;

@RunWith(Categories.class)
@IncludeCategory(BasicCases.class)
@ExcludeCategory(ExceptionalCases.class)
@SuiteClasses( {
	CalculatorDivideTest.class, 
	CalculatorSqrtTest.class 
})
public class BasicTests {
}
