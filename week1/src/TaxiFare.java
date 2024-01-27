public class TaxiFare {
  public static int calculateFare(double distance) {
    final double MINIMUM_DISTANCE = 0.01;
    // A small value to handle floating-point inaccuracies.
    final double EPSILON = 1e-1;

    if (Math.abs(distance % MINIMUM_DISTANCE) > EPSILON) {
      // Print a message and return -1 to indicate an error.
      System.out
          .println(
              "Error: The program only accepts travel distances no more accurate than 10 meters (0.01 kilometers).");
      return -1;
    }

    double fare;

    if (distance < 1) {
      fare = 10000;
    } else if (distance == 1.0) {
      fare = 15000;
    } else if (distance <= 10) {
      fare = 15000 + 12000 * (distance - 1);
    } else {
      // Calculate fare for distances beyond 10 KM with decreasing cost every 10 KM.
      fare = 15000 + 12000 * 9;
      double currentCost = 11000;
      int fullTens = (int) (distance / 10);
      // Iterate through each 10 KM segment and adjust fare accordingly.
      for (int i = 0; i < fullTens; i++) {
        fare += currentCost * (i == fullTens - 1 ? distance % 10 : 10);
        if (currentCost > 7000) {
          currentCost -= 500;
        }
      }
    }

    // Round up the calculated fare to the nearest thousand (VND).
    return (int) Math.ceil(fare / 1000) * 1000;
  }
}
