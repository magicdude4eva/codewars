public class PigLatin {
    public static String pigIt(String str) {
      // Use regex word-character "\w" to get first char, and then swop and append "ay"
      return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
