import java.util.stream.Collectors;
import java.util.stream.*;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    
    // 1 check if it takes ten turns at a minute ech
    // 2 backtrack - number of NORTH = SOUTH
    // 3 backtrack - number of WEST  = EAST
    return walk.length == 10
      && (countChars(walk, 'n') == countChars(walk, 's'))
      && (countChars(walk, 'w') == countChars(walk, 'e'));
  }

  // We use a simple stream and then find the direction and count the occurrence
  public static long countChars(char[] walk, char chDirection) {
    return new String(walk).chars().filter(ch -> ch == chDirection).count();

  }

}
