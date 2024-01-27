public class HighAndLow {
  public static String highAndLow(String numbers) {
    String[] numsArray = numbers.split(" ");
    int[] intArray = new int[numsArray.length];

    try {
      for (int i = 0; i < numsArray.length; i++) {
        intArray[i] = Integer.parseInt(numsArray[i]);
      }
    } catch (NumberFormatException e) {
      // Handle the case where the input contains invalid non-integer values.
      System.out.println("Error: invalid input");
      return null;
    }

    // Initialize variables to keep track of the maximum and minimum values.
    int max = intArray[0];
    int min = intArray[0];

    // Iterate through the integer array to find the maximum and minimum values.
    for (int num : intArray) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }

    // Return a string containing the maximum and minimum values.
    return max + " " + min;
  }
}
