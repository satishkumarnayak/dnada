package coding.arrays;

public class Arrays {

  public void oneDimensionalArray() {
    int a[] = {1, 2, 3, 4};
    for (int i : a) {
      // System.out.println(i);
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

  }

  public void twoDimensionalArray() {
    int arr1[][] = new int[3][2];

    int arr[][] = {{2, 4, 6},{5, 8, 7}, {9, 6, 3}};

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "  ");
      }
      System.out.println("");
    }

    System.out.println(arr[0][2]);
    System.out.println("=================================");
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        arr1[i][j] = i + j;
      }
    }

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.print(arr1[i][j] + "  ");
      }
      System.out.println("");
    }

  }


}
