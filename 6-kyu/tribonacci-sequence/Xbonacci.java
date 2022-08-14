import java.util.Arrays;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    // Create array and copy/pad it with n
    double[] tribonacci = Arrays.copyOf(s, n);
    
    // Start at position 3 and then sum up last 3 numbers
    for (int iCount = 3; iCount < n; iCount++) {
      tribonacci[iCount] = tribonacci[iCount - 1] + tribonacci[iCount - 2] + tribonacci[iCount - 3];
    }
    
    return tribonacci;
  }
}
