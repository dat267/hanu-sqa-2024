package src;

public class CalculatePreTaxPrice {
  public static double calculatePreTaxPrice(double salePrice) {
    double taxRate = 0.05;
    if (salePrice >= 100) {
      taxRate = 0.10;
    }

    double preTaxPrice = salePrice / (1 + taxRate);
    preTaxPrice = Math.floor(preTaxPrice * 100) / 100;
    return preTaxPrice;
  }
}
