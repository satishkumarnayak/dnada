package coding;

public class Main {

  // ip 112-39-8552
  // out 112/8552/39
  
  /*
   Step1 - sub
   */
  
  
  
  public static void main(String[] args) {

    System.out.println("Hello World!");
    String input = "112-39-8552";
    System.out.println(changeFormat("Please quote your policy number: 112-39-8552."));
 //   String result = changeFormat(input);
 //   System.out.println(result);

  }

  public static String changeFormat(String paragraph) {
   String s =  paragraph.substring(25, 35);
   System.out.println(s);
     String result = "";
     String[] split = paragraph.split("-");
     if(split.length > 3) {
       throw new UnsupportedOperationException();
     }
     result = split[0]+"/"+split[2]+"/"+split[1];
     return result;
    
  }


}
