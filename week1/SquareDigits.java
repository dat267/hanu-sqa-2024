import java.util.Arrays;

public class SquareDigits {

    public static void main(String[] args) {
        int[] numbers = {9119, 3215, 4023, 794, 287};
        int[] expected = {811181, 94125, 16099, 4916, 649};

        for (int i = 0; i < numbers.length; i++) {
            int actual = squareDigits(numbers[i]);
            if (actual == expected[i]) {
                System.out.println("Test passed: " + numbers[i] + " -> " + expected[i]);
            } else {
                System.out.println("Test failed: " + numbers[i] + " -> expected: " + expected[i] + ", actual: " + actual);
            }
        }
    }

    // Squares every digit of a number and concatenates them.
    public static int squareDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        StringBuilder squaredDigits = new StringBuilder();

        for (String digit : digits) {
            int squaredDigit = Integer.parseInt(digit) * Integer.parseInt(digit);
            squaredDigits.append(squaredDigit);
        }

        return Integer.parseInt(squaredDigits.toString());
    }
}