package org.jfree.data;
 
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class RangeTest {
	 private Range rangeObjectUnderTest;
	
	@Before
	public void setUp() throws Exception {
	 rangeObjectUnderTest = new Range(-1, 1);
	 }
	
	@After
	public void tearDown() throws Exception {
	 }
 
	@Test
	public void testCentralValueShouldBeZero() { 
		  assertEquals("The central value of -1 and 1 should be 0", 
		    	 	0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);  
		  
	} 
	
	//Example of a Range Junit test-  getLength Test
	
	@Test 
	public void testGetLengthOfBothPostiveAndEqualRanges() {
		Range R1 = new Range(5,5);
		assertEquals("GetLength: This did not give back the expected outcome:", 0.0, R1.getLength(), 0.000000001d);
	}
	
	@Test
	public void testGetLengthOfBothPositiveAndNotEqualRanges() {
		Range R2 = new Range(3,8);
		assertEquals("GetLength: This did not give back the expected outcome:", 5.0, R2.getLength(), 0.000000001d);
		
	}
	
	@Test
	public void testGetLengthOfBothNegativeAndEqualRanges() {
		Range R3 = new Range(-53,-53);
		assertEquals("GetLength: This did not give back the expected outcome:", 0.0, R3.getLength(), 0.000000001d);
	}
	
	@Test 
	public void testGetLengthOfBothNegativeAndNotEqualRanges() {
		Range R4 = new Range(-60,-5);
		assertEquals("GetLength: This did not give back the expected outcome:", 55.0, R4.getLength(), 0.000000001d);
	}
	
	@Test
	public void testGetLengthOfBothOnePositiveAndOneNegiveRange() {
		Range R5 = new Range(-2,5);
		assertEquals("GetLength: This did not give back the expected outcome:", 7.0, R5.getLength(), 0.000000001d);
	}
	
	// First Range Junit Test - GetCentralValue Test
	
	@Test
	public void testCentralValuesBothShouldBeZero() {
		assertEquals("The Central Value for the example -1 and 1 should be 0", 0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);
		
	}
	
	@Test
	public void testCentralValueWhereBothArePositive() {
		Range CVRange = new Range (4,10);
		assertEquals("GetCentralValue: This did not give back the expected outcome", 7.0, CVRange.getCentralValue(), 0.000000001d);
	}
	
	@Test
	public void testCentralValueWhereBothAreNegative() {
		Range CVRange = new Range (-4,0);
		assertEquals("GetCentralValue: This did not give back the expected outcome", -2.0, CVRange.getCentralValue(), 0.000000001d);
	
	}
	
	@Test
	public void testCentralValueWhereOneIsPositiveAndOneIsNegative() {
		Range CVRange = new Range (-2,6);
		assertEquals("GetCentralValue: This did not give back the expected outcome", 2.0, CVRange.getCentralValue(), 0.000000001d);
	}
	
	@Test
	public void testCentralValueIfFloatValueIsPresent() {
		Range CVRange = new Range (6,7);
		assertEquals("GetCentralValue: This did not return the expected outcome", 6.5, CVRange.getCentralValue(), 0.000000001d);
	}

	//Second Range Junit test - getLowerBound Test
	
	@Test
	public void testGetLowerBoundForAPositiveRangeValue() {
		Range LowRange = new Range(5,9);
		assertEquals("GetLowerBound: This did not return the expected outcome", 5, LowRange.getLowerBound(), 0.000000001d);
	}
	
	@Test
	public void testGetLowerBoundForAPositiveRangeandEqualRange() {
		Range LowRange = new Range(10,10);
		assertEquals("GetLowerBound: This did not return the expected outcome", 10, LowRange.getLowerBound(),  0.000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundForANegativeRange() {
		Range LowRange = new Range (-20,-15);
		assertEquals("GetLowerBound: This did not return the expected outcome", -20, LowRange.getLowerBound(),  0.000000001d);
	}
	
	@Test
	public void testGetLowerBoundWithANegativeAndANEqualRange() {
		Range LowRange = new Range(-15,-15);
		assertEquals("GetLowerBound: This did not return the expected outcome", -15, LowRange.getLowerBound(),  0.000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundValueWithBothPositiveAndNegativeRange() {
		Range LowRange = new Range(-15,15);
		assertEquals("GetLowerBound: This did not return the expected outcome", -15, LowRange.getLowerBound(),  0.000000001d);
		
	}
	
	@Test
	public void testGetLowerBoundWithBothZeroRangeValue() {
		Range LowRange = new Range(0,0);
		assertEquals("GetLowerBound: This did not return the expected outcome", 0, LowRange.getLowerBound(),  0.000000001d);
		
	}
	
	//Third Range Junit test - getUpperBound Test
	
		@Test
		public void testGetUpperBoundWithPositiveRange() {
			Range PRange = new Range (3,7);
			assertEquals("getUpperBound: This did not give back the expectd outcome", 7, PRange.getUpperBound(), 0.000000001d);
		}
		
		@Test
		public void testGetUpperBoundWithPositiveRangeAndEqualRange() {
			Range PRange = new Range (5,5);
			assertEquals("getUpperBound: This did not give back the expectd outcome", 4, PRange.getUpperBound(), 0.000000001d);
		}
		
		@Test
		public void testGetUpperBoundWithNegativeRange() {
			Range PRange = new Range (-5,-2);
			assertEquals("getUpperBound: This did not give back the expectd outcome", -2, PRange.getUpperBound(), 0.000000001d);
		}
		
		@Test
		public void testGetUpperBoundWithNegativeRangeAndEqualRange() {
			Range PRange = new Range (-5, -5);
			assertEquals("getUpperBound: This did not give back the expectd outcome", -5, PRange.getUpperBound(), 0.000000001d);
		}
		
		@Test
		public void testGetUpperBoundWithPositiveAndANegativeRange() {
			Range PRange = new Range (-5,5);
			assertEquals("getUpperBound: This did not give back the expectd outcome", 5, PRange.getUpperBound(), 0.000000001d);
		}
		
		@Test
		public void testGetUpperBoundWithAZeroRange() {
			Range PRange = new Range (0,0);
			assertEquals("getUpperBound: This did not give back the expectd outcome", 0, PRange.getUpperBound(), 0.000000001d);
		}
		
	
	//Forth Range Junit Test - ExpandToInclude Test
	
	@Test 
	public void testExapndToIncludeBothAPositiveAndANAboveRangeValue() {
		Range First_Range = new Range (4,9);
		Range Second_Range = new Range (4,10);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,10));
		
	}
	
	@Test 
	public void testExapndToIncludeBothAPositiveAndABelowRangeValue() {
		Range First_Range = new Range (1,4);
		Range Second_Range = new Range (-1,4);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-1));
	}
	
	@Test
	public void testExapndToIncludeBothAPositiveAndWithinARangeValue() {
		Range First_Range = new Range (1,3);
		Range Second_Range = new Range (1,3);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,3));
	}
	
	@Test
	public void testExapndToIncludeBothANegativeAndAboveTheRangeValue() {
		Range First_Range = new Range (-4,-1);
		Range Second_Range = new Range (-4,4);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,4));
	}
	
	@Test
	public void testExapndToIncludeBothANegativeAndBelowTheRangeValue() {
		Range First_Range = new Range (-4,-1);
		Range Second_Range = new Range (-5,-1);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-5));
	}
	
	@Test
	public void testExapndToIncludeBothANegativeRangeAndWithinARangeValue() {
		Range First_Range = new Range (-3,-1);
		Range Second_Range = new Range (-3,-1);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-2));
	}
	
	@Test
	public void testExapndToIncludeBothOnePositiveAndOneNegativeRangeWithInAboveRangeValue() {
		Range First_Range = new Range (-3, 2);
		Range Second_Range = new Range (-3,4);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,4));
	}
	
	@Test
	public void testExapndToIncludeBothAPositiveAndOneNegtiveRangeWithInABelowRangeValue() {
		Range First_Range = new Range (-3,2);
		Range Second_Range = new Range (-4,2);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-4));
	}
	
	@Test
	public void testExapndToIncludeOnePositiveAndOneNegativeRangeWithinRangeValue() {
		Range First_Range = new Range (-3,3);
		Range Second_Range = new Range (-3,-1);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,1));
	}
	
	@Test
	public void testExapndToIncludeAnEqualAndPositiveRangeWithAnAboveRangeValue() {
		Range First_Range = new Range (2,2);
		Range Second_Range = new Range (2,6);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,6));
	}
	
	@Test
	public void testExapndToIncludeEqualAndPositiveRangeWithBelowRangeValue() {
		Range First_Range = new Range (2,2);
		Range Second_Range = new Range (1,3);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,1));
	}
	
	@Test
	public void testExapndToIncludeEqualandPositiveRangeAndWithAnEqualRangeValue() {
		Range First_Range = new Range (2,2);
		Range Second_Range = new Range (2,2);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,2));
	}
	
	@Test
	public void testExapndToIncludeEqualAndNegativeRangeAndAboveRangeValue() {
		Range First_Range = new Range (-4,-4);
		Range Second_Range = new Range (-4,-2);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-2));
	}
	
	@Test
	public void testExapndToIncludeEqualAndNegativeRangeAndBelowRangeValue() {
		Range First_Range = new Range (-4,-4);
		Range Second_Range = new Range (-10,-4);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-10));
	}
	
	@Test
	public void testExapndToIncludeEqualAndNegativeRangeWithinARangeValue() {
		Range First_Range = new Range (-4,-4);
		Range Second_Range = new Range (-4,-4);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(First_Range,-3));
	}
	
	@Test
	public void testExapndToIncludeANullRangeExample() {
		Range Second_Range = new Range (5,5);
		assertEquals("expectedToInclude: this did not return the expected outcome", Second_Range, rangeObjectUnderTest.expandToInclude(null,5));
	}
	
	
	//Final Range Junit Test - Intersects Test
	
	@Test
	public void testIntersectsAllPositiveEqualTrue() {
		Range InRange = new Range (3,7);
		assertEquals("Intersects: This did not return the expected outcome", true, InRange.intersects(2, 6));
	}
	
	@Test
	public void testIntersectsAllPositiveEqualFalse() {
		Range InRange = new Range (6,7);
		assertEquals("Intersects: This did not return the expected outcome", false, InRange.intersects(1, 4));
	}
	
	@Test
	public void testIntersectsAllPositiveAndAreEqual() {
		Range InRange = new Range (4,4);
		assertEquals("Intersects: This did not return the expected outcome", true, InRange.intersects(4, 4));
	}
	
	@Test
	public void testIntersectsAllNegativeAndAreTrue() {
		Range InRange = new Range (-5,-3);
		assertEquals("Intersects: This did not return the expected outcome", true, InRange.intersects(-6,-2));
	}
	
	@Test
	public void testIntersectsAllNegativeAndAreFalse() {
		Range InRange = new Range (-7,-4);
		assertEquals("Intersects: This did not return the expected outcome", false, InRange.intersects(-3,-1));
	}
	
	@Test
	public void testIntersectsAllNegaiveAndAreEqual() {
		Range InRange = new Range (-6,-6);
		assertEquals("Intersects: This did not return the expected outcome", true, InRange.intersects(-6,-6));
	}

	@Test
	public void testIntersectsAllNegaiveButInputIsPositive() {
		Range InRange = new Range (-7,-6);
		assertEquals("Intersects: This did not return the expected outcome", false, InRange.intersects(6,7));
	}
	
	@Test
	public void testIntersectsPositiveRangeWithNegativeInpute() {
		Range InRange = new Range (5,6);
		assertEquals("Intersects: This did not return the expected outcome", false, InRange.intersects(-6,-5));
	}
	
	@Test
	public void testIntersectsBothValuesLowerNegatives() {
		Range InRange = new Range (-7,4);
		assertEquals("Intersects: This did not return the expected outcome", true, InRange.intersects(-7,4));
	}
	@Test
	public void testIntersectsAreAllZero() {
		Range InRange = new Range (0,0);
		assertEquals("Intersects: This did not return the expected outcome", true, InRange.intersects(0,0));
	}
	
}
 