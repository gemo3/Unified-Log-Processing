package hellocalculator;

import java.util.Arrays;

public class HelloCalculator {
  
  public static void main(String[] args) {
    if (args.length < 2) {
      String err = "too few inputs (" + args.length + ")";
      throw new IllegalArgumentException(err);
    } else {
      try {
        Integer sum = sum(args);
        System.out.println("SUM: " + sum);
      } catch (NumberFormatException nfe) {
        String err = "not all inputs parseable to Integers";
        throw new IllegalArgumentException(err);
      }
    }
  }

  static Integer sum(String[] args) throws NumberFormatException {
    return Arrays.asList(args)
      .stream()
      .mapToInt(str -> Integer.parseInt(str))
      .sum();
  }
}
