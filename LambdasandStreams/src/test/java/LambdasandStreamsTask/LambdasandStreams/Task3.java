package LambdasandStreamsTask.LambdasandStreams;
import java.util.*;
public class Task3 {
	 public static void main(String[] args) {
		 List<String>b=Arrays.asList("abc","cde","efg","abcde","abf","abba","aba","madam");
		 System.out.println(task3(b));
	 }
	 //returns list of strings which are palindromes
	 static  ArrayList<String> task3(List<String> a){
	        ArrayList<String>res=new ArrayList<>();
	        a.stream().filter((p)->isPalindrome(p)).map((p)->(p)).forEach((p)->res.add(p));
	        return res;
	    }
	 
	 //checks whether the string is palindrome or not
	  static boolean isPalindrome(String s) {
          int n = s.length();
          for (int i = 0; i < (n/2); i++) {
              if (s.charAt(i) != s.charAt(n - i - 1)) {
                  return false;
              }
          }

          return true;
      }


}
