package n15$n44;

public class MainClass38$2 {
	 public static void main(String args[]) {
	      char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
	      String s1 = "String";
	     
	      String s2 = s1.copyValueOf( chars);
	      String s3 = s1.copyValueOf( chars, 2, 7 );
	      System.out.println("String without offset: 				" + s2);
	      System.out.println("String with offset 2 and length 7: 	  " + s3);
	   }
}
