import java.util.*;
import java.util.stream.*;

public class JadenCase {

  public String toJadenCase(String phrase) {
    // Sanity check, because good devs to this :-)
    if (phrase == null || phrase.isEmpty()) {
        return null;
    }

    // Java8 and streams
    return Arrays.stream(phrase.split("\\s+"))
            .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
            .collect(Collectors.joining(" "));
  }

}
