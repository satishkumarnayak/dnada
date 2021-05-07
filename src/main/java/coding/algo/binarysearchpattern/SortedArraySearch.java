package coding.algo.binarysearchpattern;

public class SortedArraySearch {

  // Time = O(n) Space = O(1)
  public boolean binarySearch(int[] array, int target) {
    for (int ele : array) {
      if (target == ele) {
        return true;
      }
    }
    return false;
  }
  // Time = O(logn) Space = O(1)
  public boolean binarySearch2(int[] array, int target) {
    int begin = 0;
    int end = array.length - 1;
    int mid = array.length / 2;
    while(begin <= end) {
      if(target == array[mid] ) {
        return true;
      }else if(target < array[mid]) {
        end = mid - 1;
        mid = (begin + end) / 2;
      }else if(target > array[mid]) {
        begin = mid + 1;
        mid = (begin + end) / 2;
      }
      
    }
    return false;
  }



}
