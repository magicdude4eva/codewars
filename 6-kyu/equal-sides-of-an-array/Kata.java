import java.util.stream.IntStream;

public class Kata {
  public static int findEvenIndex(int[] arr) {
    // 1 get stream for array
    // 2 find front sum vs back sum
    // 3 find first or return -1 if not found
    return IntStream.range(0, arr.length)
        .filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n + 1).sum())
        .findFirst().orElse(-1);
  }
}
