import java.util.Arrays;

public class Kata
{
  public static long nextSmaller(long n)
  {
    // convert string to `char[]` array
    char[] numbers = Long.toString(n).toCharArray();
    
    for (int iNumCount = numbers.length; iNumCount > 0; iNumCount--) {
      char chCurrDigit = numbers[iNumCount-1];
      
      for (int j = iNumCount; j < numbers.length; j++) {
        if (numbers[j] < chCurrDigit) {
          numbers[iNumCount-1] = numbers[j];
          numbers[j] = chCurrDigit;
          return (numbers[0] == '0') ? -1 : Long.parseLong(new String(numbers));
        }
      }
      
      System.arraycopy(numbers, iNumCount, numbers, iNumCount - 1, numbers.length - iNumCount);
      numbers[numbers.length-1] = chCurrDigit; 
    }
    
    return -1;

  }
}
