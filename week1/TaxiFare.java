import java.util.Scanner;

public class TaxiFare {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the travel distance (in kilometers): ");
      double distance = scanner.nextDouble();

      double fare = calculateTaxiFare(distance);

      System.out.printf("The taxi fare is: %.0f VND\n", fare);
    }
  }

  // Calculates the taxi fare from the distance entered by the user.
  public static double calculateTaxiFare(double distance) {
    // Round the distance to the nearest 10 meters.
    distance = Math.round(distance * 10) / 10.0;

    double fare = 0;

    // Minimum fare.
    if (distance < 1) {
      fare = 10000;
    }
    // First kilometer.
    else if (distance <= 2) {
      fare = 15000;
    }
    // Next 9 kilometers.
    else if (distance <= 10) {
      fare = 15000 + (distance - 1) * 12000;
    }
    // From 11th kilometer onwards.
    else {
      fare = 15000 + 9 * 12000 + (distance - 10) * 11000;

      // Reduce the fare every other 10 kilometers.
      while (distance > 20) {
        fare -= 500;
        distance -= 10;
      }
    }

    // Round the fare up to the nearest thousand.
    return Math.ceil(fare / 1000) * 1000;
  }
}