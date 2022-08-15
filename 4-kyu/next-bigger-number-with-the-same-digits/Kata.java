import java.util.Arrays;

public class Kata
{
    public static long nextBiggerNumber(long n) {

    // convert string to `char[]` array
    char[] numbers = Long.toString(n).toCharArray();
    int length = numbers.length, iNumCount = 0;
      
    // 1 Start from the right most digit and find the first digit that is smaller than the digit next to it.
    for (iNumCount = length - 1; iNumCount > 0; iNumCount--) {
      if (numbers[iNumCount] > numbers[iNumCount - 1]) {
        break;
      }
    }
    
    // 2 If no such digit is found, then all digits are in descending order means there cannot be a greater number with same set of digits
    if (iNumCount == 0) {
      return -1; // Not possible
    } else {
      int x = numbers[iNumCount - 1], min = iNumCount;
      
      // 3 Find the smallest digit on right side of (iNumCount - 1)'th digit that is greater than number[iNumCount-1]
      for (int j = iNumCount + 1; j < length; j++) {
        if (numbers[j] > x && numbers[j] < numbers[min]) {
          min = j;
        }
      }
 
      // 4 Swap the above found smallest digit with number[iNumCount - 1]
      char temp = numbers[iNumCount - 1];
      numbers[iNumCount - 1] = numbers[min];
      numbers[min] = temp;
      
      // 5 Sort the digits after (iNumCount - 1) in ascending order
      Arrays.sort(numbers, iNumCount, length);
      
      return (numbers[0] == '0') ? -1 : Long.parseLong(new String(numbers));     
    }
  }
}
