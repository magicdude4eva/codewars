import java.util.*;

class DoubleLinear {
    
    public static int dblLinear (int n) {
        // your code
      TreeSet<Integer> set = new TreeSet<Integer>();
      set.add(1);
      int num = set.first();
      
      for (int i = 0; i < n; i++){
        set.add (2 * num + 1);
        set.add (3 * num + 1);
        num = set.higher(num);
      }
      
	    return num;
    }
}
