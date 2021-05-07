package coding.algo.adhoc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {


  // Time - O(nlogn) Space- O(1)
  public int findDuplicate(int[] array) {

    Arrays.sort(array);

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] == array[i + 1]) {
        return array[i];
      }
    }

    return Integer.MIN_VALUE;
  }

  // Time - O(n) , Space - O(n)
  public int findDuplicate2(int[] array) {
    Set<Integer> set = new HashSet();
    for (int i : array) {
      if (set.contains(i)) {
        return i;
      } else {
        set.add(i);
      }
    }
    return Integer.MIN_VALUE;
  }

  // Time O(n) , Space - O(n)
  public int findDuplicate3(int[] array) {
    int[] aux = new int[array.length];
    for (int i = 0; i < array.length; i++) {

      if (aux[array[i]] == 1) {
        return array[i];
      } else {
        aux[array[i]] = 1;
      }
    }
    return Integer.MIN_VALUE;

  }

// Time O(n) Space O(1)
  public int findDuplicate4(int[] array) {
    /*
     * for (int i = 0; i < array.length; i++) { int j = array[i]; if(j < 0) { return array[i]; }
     * else { array[i] = Math.abs(array[i]); } }
     */

    // 1, 3, 2, 3    4
    // -1 -3 -3
    int i = 0;
    while (i < array.length) {
      int j = array[i];
      if (j < 0) {

        return Math.abs(array[i]);

      } else {
        array[i] = Math.negateExact(array[i]);

      }

      i = Math.abs(array[i]);
    }
    return Integer.MIN_VALUE;
  }
}


