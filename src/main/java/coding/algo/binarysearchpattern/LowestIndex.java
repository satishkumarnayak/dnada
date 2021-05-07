package coding.algo.binarysearchpattern;

public class LowestIndex {

  public int lowestIndex(int[] array, int target) {
    int lowestIndex = -1; // 3 

    int left = 0;
    int right = array.length - 1;
// 3 4 4 4 8 9 11 
    while (left <= right) {
      int mid = (left + right) / 2;  //3
      if (target <= array[mid]) {
        right = mid - 1 ;
        lowestIndex = mid;
      }else if((target > array[mid])) {
        left = mid +1;

      }
      
    }


    return lowestIndex;

  }

  
}