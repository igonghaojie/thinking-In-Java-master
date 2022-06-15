//: holding/SetOfInteger.java
package holding; /* Added by Eclipse.py */
import java.util.*;

public class SetOfInteger {
  static int a=0;
  public static void main(String[] args) {
    Random rand = new Random(47);
    
    Set<Integer> intset = new HashSet<Integer>();
    for(int i = 0; i < 10000; i++)
    {
      //System.out.println(rand.nextInt(30));
      intset.add(rand.nextInt(30));
      a++;
    }
    System.out.println(intset);
    System.out.println(a);
  }
} /* Output:
[15, 8, 23, 16, 7, 22, 9, 21, 6, 1, 29, 14, 24, 4, 19, 26, 11, 18, 3, 12, 27, 17, 2, 13, 28, 20, 25, 10, 5, 0]
*///:~
