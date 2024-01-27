public class SquareDigits {
  public static int squareDigits(int n) {
    // Check if the input number is 0, in which case the result is also 0.
    if (n == 0) {
      return 0;
    }

    String result = "";
    while (n != 0) {
      // Extract the last digit of the number.
      int digit = n % 10;
      // Square the digit and append the result to the front (left) of the string.
      result = digit * digit + result;
      // Remove the last digit from the number.
      n /= 10;
    }
    return Integer.parseInt(result);
  }

}
