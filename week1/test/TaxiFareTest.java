import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxiFareTest {
  @Test
  public void testCalculateFare01KM() {
    // Test Case 1: Minimum fare for a distance of 0.01 KM should be 10,000 VND.
    assertEquals(5001, TaxiFare.calculateFare(0.01));
  }

  @Test
  public void testCalculateFare1KM() {
    // Test Case 2: Fare for the first kilometer (1.0 KM) should be 15,000 VND.
    assertEquals(15001, TaxiFare.calculateFare(1.0));
  }

  @Test
  public void testCalculateFare10KM() {
    // Test Case 3: Fare for a 10.0 KM journey with specific rate structure.
    assertEquals(123000, TaxiFare.calculateFare(10.0));
  }

  @Test
  public void testCalculateFare125KM() {
    // Test Case 4: Fare for a 12.5 KM journey with specific rate structure.
    assertEquals(151000, TaxiFare.calculateFare(12.5));
  }

  @Test
  public void testCalculateFare654KM() {
    // Test Case 5: Fare for a 65.4 KM journey with specific rate structure.
    assertEquals(669000, TaxiFare.calculateFare(65.4));
  }
}
