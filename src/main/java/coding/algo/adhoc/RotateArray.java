package coding.algo.adhoc;

import java.util.Arrays;

public class RotateArray {

  public int[] rotateBF(int[] array, int k) {

    /*
     * 2 5 8 4 3 6 6 2 5 8 4 3 k = 3 4 3 6 2 5 8
     * 
     * Rotate array till k times and keep shifting the eles
     */


    for (int i = 1; i <= k; i++) {
      int last = array[array.length - 1]; // 8
      for (int j = array.length - 2; j >= 0; j--) { //
        array[j + 1] = array[j];

      }
      array[0] = last;
    }
    return array;
  }

  public int[] rotate2(int[] array, int k) {

    int[] out = new int[array.length];
    for (int i = array.length - k, j = 0; i < array.length; i++, j++) {
      out[j] = array[i];
    }
    // System.out.println(Arrays.toString(out));
    for (int i = 0, j = k; j < out.length; i++, j++) {
      out[j] = array[i];
    }
    return out;
  }

  public int[] rotate3(int[] array, int k) {
    
    swap(array,0,array.length-1);
    swap(array,0,k-1);
    swap(array,k,array.length-1);
    return array;
  }
  
  private void swap(int[] array, int start, int end) {
    while(start < end) {
      int temp = array[start];
      array[start]= array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
