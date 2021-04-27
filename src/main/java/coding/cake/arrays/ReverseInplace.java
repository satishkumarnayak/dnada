package coding.cake.arrays;

public class ReverseInplace {
  
  /*

  ip - hello
  op - olleh

  Step 1 - Loop through the array from begin and from back indexes till middle
  Step 2 - Swap using a temp varaible
              temp = i;
              i = j;
              j = temp;


  */
  public void reverse(char[] characters) {
    if (characters == null || characters.length == 1)
      return;
    for (int i = 0, j = characters.length - 1; i < j; i++, j--) {
      char temp = characters[i];
      characters[i] = characters[j];
      characters[j] = temp;
    }

  }

}
