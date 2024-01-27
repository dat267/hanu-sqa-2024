package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CalculatePreTaxPrice;

public class CalculatePreTaxPriceTest {
  @Test
  public void testCalculatePreTaxPrice() {
    // Test Case 1: Sale price is $12, pre-tax price should be $11.42 (5% tax).
    assertEquals(11.42, CalculatePreTaxPrice.calculatePreTaxPrice(12), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice100() {
    // Test Case 2: Sale price is $100, pre-tax price should be $90.91 (10% tax).
    assertEquals(90.91, CalculatePreTaxPrice.calculatePreTaxPrice(100), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice50() {
    // Test Case 3: Sale price is $50, pre-tax price should be $47.61 (5% tax).
    assertEquals(47.61, CalculatePreTaxPrice.calculatePreTaxPrice(50), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice10() {
    // Test Case 4: Sale price is $10, pre-tax price should be $9.52 (5% tax).
    assertEquals(9.52, CalculatePreTaxPrice.calculatePreTaxPrice(10), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice121() {
    // Test Case 5: Sale price is $121, pre-tax price should be $110.00 (10% tax).
    assertEquals(110.00, CalculatePreTaxPrice.calculatePreTaxPrice(121), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice165() {
    // Test Case 6: Sale price is $165, pre-tax price should be $150.00 (10% tax).
    assertEquals(150.00, CalculatePreTaxPrice.calculatePreTaxPrice(165), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice220() {
    // Test Case 7: Sale price is $220, pre-tax price should be $200.00 (10% tax).
    assertEquals(200.00, CalculatePreTaxPrice.calculatePreTaxPrice(220), 0.02);
  }
}
