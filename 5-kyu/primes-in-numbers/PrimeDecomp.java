import java.util.*;


public class PrimeDecomp {
  /*
   * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
   * "(p1**n1)(p2**n2)...(pk**nk)"
   * where a ** b means a to the power of b 
  */
   
    public static String factors(int n) {
      String result = "";
      
      for (int candidate = 2; candidate <= n; ++candidate) {
        int count;
        for (count = 0; n % candidate == 0; ++count) {
          n /= candidate;
        }
        
        if (count > 0) {
          result += "(" + candidate + (count > 1 ? "**" + count : "") + ")";
        }
      }

    return result;
    }
       
}
