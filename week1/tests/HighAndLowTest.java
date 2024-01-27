package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.HighAndLow;

public class HighAndLowTest {
  @Test
  public void testHighAndLowExample1() {
    // Example 1
    assertEquals("5 1", HighAndLow.highAndLow("1 2 3 4 5"));
  }

  @Test
  public void testHighAndLowExample2() {
    // Example 2
    assertEquals("5 -3", HighAndLow.highAndLow("1 2 -3 4 5"));
  }

  @Test
  public void testHighAndLowExample3() {
    // Example 3
    assertEquals("9 -5", HighAndLow.highAndLow("1 9 3 4 -5"));
  }

  @Test
  public void testHighAndLowSingleNumber() {
    // Single Number
    assertEquals("42 42", HighAndLow.highAndLow("42"));
  }

  @Test
  public void testHighAndLowNegativeNumbers() {
    // Negative Numbers
    assertEquals("-3 -10", HighAndLow.highAndLow("-10 -5 -3 -8"));
  }
}
