public class PangramChecker {
  public boolean check(String sentence){
    
    // Use streams
    // 1 get chars
    // 2 filter letters
    // 3 map lower case
    // 4 filter out distinct characters
    // 5 count that we have covered whole alphabet
    return sentence.chars()
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .distinct()
            .count() == 26;    
  }
}
