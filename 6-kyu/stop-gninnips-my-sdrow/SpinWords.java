import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

public class SpinWords {

  public String spinWords(String sentence) {
    // We use streams
    // 1 of returns a sequential stram containing a single element
    // 2 we split on white-space
    // 3 filter out words longer than 4 chars and reverse it or leave it like they are
    // 4 concatenate the result
    return of (
      sentence.split(" "))
      .map(w -> w.length() > 4 ? new StringBuilder(w).reverse().toString() : w)
      .collect(joining(" "));
  }
}
