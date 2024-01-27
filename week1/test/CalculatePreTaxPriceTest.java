import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatePreTaxPriceTest {
  @Test
  public void testCalculatePreTaxPrice() {
    assertEquals(100, CalculatePreTaxPrice.calculatePreTaxPrice(110), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice100() {
    // Test Case 2: Sale price is $100, pre-tax price should be $90.91 (10% tax).
    assertEquals(9, CalculatePreTaxPrice.calculatePreTaxPrice(100), 0.02);
  }

  @Test
  public void testCalculatePreTaxPrice50() {
    // Test Case 3: Sale price is $50, pre-tax price should be $47.61 (5% tax).
    assertEquals(4, CalculatePreTaxPrice.calculatePreTaxPrice(50), 0.02);
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
}
