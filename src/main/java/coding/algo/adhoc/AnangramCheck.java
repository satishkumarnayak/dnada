package coding.algo.adhoc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class AnangramCheck {

  // aaabc
  // aacbd
  // Time - O(nlogn) , Space - O(1)
  public boolean anagram(String string1, String string2) {
    boolean result = true;
    char[] chs1 = string1.toCharArray();
    char[] chs2 = string2.toCharArray();

    Arrays.sort(chs1);
    Arrays.sort(chs2);

    for (int i = 0; i < chs1.length; i++) {
      if (chs1[i] != chs2[i]) {
        result = false;
        return result;
      }

    }
    return result;
  }

  // Time - O(n) , Space - O(n)
  public boolean anagram2(String string1, String string2) {
    boolean result = true;
    Map<Character, Integer> map = new HashMap();
    char[] chs1 = string1.toCharArray();
    for (char ch : chs1) {
      Character key = Character.valueOf(ch);
      if (map.containsKey(key)) {
        int frequency = map.get(key);
        frequency++;
        map.put(key, frequency);
      } else {
        map.put(key, 1);
      }
    }

    char[] chs2 = string2.toCharArray();
    for(char ch :chs2) {
      Character key = Character.valueOf(ch);
      if(map.containsKey(key)) {
        int frequency = map.get(key);
        if(frequency == 0) {
          result = false;
        } else {
          frequency--;
          map.put(key, frequency);
        }
      } else {
        result = false;
      }
    }
    
    return result;
  }
}
