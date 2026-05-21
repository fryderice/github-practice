// how to make a random number generator
import java.util.Random;

public class RNG {
  public static void main(String[] args) {
    Random random = new Random();

    // change the number in nextInt to go from 0 (inclusive) to that number (exclusive)
    System.out.println(random.nextInt(10));
  }
}
