package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SquareDigits;

public class SquareDigitsTest {
  @Test
  public void testSquareDigits() {
    // Test Case 1: Square each digit of 9119 individually and concatenate them.
    assertEquals(811181, SquareDigits.squareDigits(9119));
  }

  @Test
  public void testSquareDigitsSingleDigit() {
    // Test Case 2: Square each digit of 0 (a single-digit number).
    assertEquals(0, SquareDigits.squareDigits(0));
  }

  @Test
  public void testSquareDigitsSingleDigit2() {
    // Test Case 3: Square a single-digit number 2.
    assertEquals(4, SquareDigits.squareDigits(2));
  }

  @Test
  public void testSquareDigitsSingleDigit4() {
    // Test Case 4: Square a single-digit number 4.
    assertEquals(16, SquareDigits.squareDigits(4));
  }

  @Test
  public void testSquareDigitsMultiDigit() {
    // Test Case 5: Square each digit of the number 12345 individually and
    // concatenate them.
    assertEquals(1491625, SquareDigits.squareDigits(12345));
  }
}
