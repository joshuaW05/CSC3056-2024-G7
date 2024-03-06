package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import original.Range;

public class DataUtilitiesTest extends TestCase {
	
	private Values2D values2D;
	
	@Before
	public void setUp() throws Exception{
		
		//ValidDataAndColumnTotal setup
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(1, 0, 0);
		testValues.addValue(4, 1, 0);
			
	}
	
	@After
	public void tearDown(){
		values2D = null;
	}
	
	// calulateRowTotal Tests
	

	@Test
	public void testTotalNullDataRow() {
		try {
			DataUtilities.calculateRowTotal(null, 0);
			fail("No Exception thrown, Expected: IllegalArgumentException");
		}
		catch (Exception e) {
			assertTrue("Incorrect Exception thrown", true);
		}
	}
	
	@Test
	public void testPostiveAndFinalRowTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(0.0, 3.0, 0.0);
		testValues.addValue(3.0, 1.0, 0.0);
		assertEquals("Did not return expected result", 7.0, DataUtilities.calculateRowTotal(values2D, 0), 0.0000001d);
	}
	
	@Test
	public void testNegativeRowTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(-0.0, -2.0, -0.0);
		testValues.addValue(-4.0, -2.0, -1.0);
		assertEquals("Did not return expected result", -7.0, DataUtilities.calculateRowTotal(values2D, 0), 0.0000001d);
	}
	
	@Test
	public void testNegativeAndFinalRowTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(-0.0, -2.0, -0.0);
		testValues.addValue(-4.0, -2.0, -1.0);
		assertEquals("Did not return expected result", -8.0, DataUtilities.calculateRowTotal(values2D, 0), 0.0000001d);
	}
	
	
	// calculateColumnTotal Tests
	
	@Test
	public void testTotalNullDataColumn() {
		try {
			DataUtilities.calculateColumnTotal(null, 0);
			fail("No Exception thrown, Expected: IllegalArgumentException");
		}
		catch (Exception e) {
			assertTrue("Incorrect Exception thrown", true);
		}
	}
	
	@Test
	public void testValidDataAndColumnTotal() { // example provideded by lecturer
		assertEquals("Wrong sum returned. Expected: 5.0", 5.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d);
	}
	
	@Test
	public void testPositiveColumnTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(0.0, 3.0, 0.0);
		testValues.addValue(3.0, 1.0, 0.0);
		assertEquals("Did not return expected result", 7.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d);
	}
	
	@Test
	public void testPostiveAndFinalColumnTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(0.0, 3.0, 0.0);
		testValues.addValue(3.0, 1.0, 0.0);
		assertEquals("Did not return expected result", 0.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d);
	}
	
	@Test
	public void testNegativeColumnTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(-0.0, -3.0, -0.0);
		testValues.addValue(-3.0, -1.0, -0.0);
		assertEquals("Did not return expected result", -7.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d);
	}
	
	@Test
	public void testNegativeAndFinalColumnTotal() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(-0.0, -3.0, -0.0);
		testValues.addValue(-3.0, -1.0, -0.0);
		assertEquals("Did not return expected result", -1.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d);
	}
	
	// createNumberArray Tests
	
	@Test
	public void testCreateNumberArray(){
		double[] data = {1.0, 2.5, 3.7};
		Number[] result = DataUtilities.createNumberArray(data);
		Number[] expected = {1.0, 2.5, 3.7};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testCreateNumberArrayEmpty() {
		double[] data = {};
		Number[] result = DataUtilities.createNumberArray(data);
		assertEquals(0, result.length);
	}
	
	@Test
	public void testCreateNumberArrayNegativeValues() {
		double[] data = {-1.5, -2.0, -3.8};
		Number[] result = DataUtilities.createNumberArray(data);
		Number[] expected = {-1.5, -2.0, -3.8};
		assertArrayEquals(expected, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateNumberArrayIncorrectDoubleInput() {
		double[] data = {1,2,3};
		DataUtilities.createNumberArray(data);
	}
	
	@Test
	public void testCreateNumberArrayLargeValues() {
		double[] data = {9999999.0, 1000000.00, 123456789.10};
		Number[] result = DataUtilities.createNumberArray(data);
		Number[] expected = {9999999.0, 1000000.00, 123456789.10};
		assertArrayEquals(expected, result);
}
	
	
	// createNumberArray2D Tests
	
	@Test
	public void testCreateNumberArray2D() {
		double[][] data = {
				{1.0, 2.5, 3.7},
				{4.2, 5.3, 6.1},
				{7.4, 8.0, 9.9}
		};
		Number[][] result = DataUtilities.createNumberArray2D(data);
		Number[][] expected = {
				{1.0, 2.5, 3.7},
				{4.2, 5.3, 6.1},
				{7.4, 8.0, 9.9}
		};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testCreateNumberArray2DEmpty() {
		double[][] data = {};
		Number[][] result = DataUtilities.createNumberArray2D(data);
		assertEquals(0, result.length);
	}
	
	@Test
	public void testCreateNumberArray2DNegativeValues() {
		double [][] data = {
				{-1.0, -2.5, -3.7},
				{-4.2, -5.3, -6.1},
				{-7.4, -8.0, -9.9}
		};
		Number[][] result = DataUtilities.createNumberArray2D(data);
		Number[][] expected = {
				{-1.0, -2.5, -3.7},
				{-4.2, -5.3, -6.1},
				{-7.4, -8.0, -9.9}
		};
		assertArrayEquals(expected, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateNumberArray2DIncorrectDoubleInput() {
		double[][] data = {
				{1, 2, 3},
				{4, 5, 6}
		};
		DataUtilities.createNumberArray2D(data);
	}
	
	@Test
	public void testCreateNumberArray2DLargeValues() {
		double[][] data = {
				{100000000.0, 9999999999.9, 300000000.0},
				{400000000.0, 5000000000.0, 600000000.0},
				{123456789.1, 1098765432.1, 246810121.4}
		};
		Number[][] result = DataUtilities.createNumberArray2D(data);
		Number[][] expected = {
				{100000000.0, 9999999999.9, 300000000.0},
				{400000000.0, 5000000000.0, 600000000.0},
				{123456789.1, 1098765432.1, 246810121.4}
		};
		assertArrayEquals(expected, result);
	}
	
	
	// getCumulativePercentages Tests
	
	
	@Test
	public void testGetCumulativePercentages() {
		DefaultKeyedValues data = new DefaultKeyedValues();
		data.addValue("0", 5.0);
		data.addValue("1", 9.0);
		data.addValue("2", 2.0);
		
		KeyedValues result = DataUtilities.getCumulativePercentages(data);
		assertEquals(1.0,(double) result.getValue(2), 0.00001);
	}
	
	@Test
	public void testGetCumulativePercentagesEmpty() {
		try {
			DataUtilities.getCumulativePercentages(new DefaultKeyedValues());
		}
		catch(Exception e){
			assertTrue("Incorrect Exception thrown", e.getClass().equals(IllegalArgumentException.class));
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetCumulativePercentagesNull() {
		try {
			DataUtilities.getCumulativePercentages(null);
		}
		catch (Exception e) {
			assertTrue("Incorrect Exception thrown", e.getClass().equals(IllegalArgumentException.class));
		}
	}
	
	@Test
	public void testGetCumulativePercentagesNonNumericValue() {
		DefaultKeyedValues data = new DefaultKeyedValues();
		data.addValue("A", null);
		
		DataUtilities.getCumulativePercentages(data);
	}
	
	@Test
	public void testGetCumulativePercentagesSingleValue() {
		DefaultKeyedValues data = new DefaultKeyedValues();
		data.addValue("0", 8);
		
		KeyedValues result = DataUtilities.getCumulativePercentages(data);
		
		assertEquals(1.0, result.getValue("0").doubleValue(), 0.0001);
	}
}
