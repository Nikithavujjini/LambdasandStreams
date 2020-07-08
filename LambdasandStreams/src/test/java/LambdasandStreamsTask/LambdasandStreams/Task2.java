package LambdasandStreamsTask.LambdasandStreams;
import java.util.*;
public class Task2 {
	public static void main(String[] args) {
		List<String>b=Arrays.asList("abc","cde","efg","abcde","abf");
		System.out.println(task(b));
	}
	//return string starting with "a" and length of 3
	 static ArrayList<String> task(List<String> a) {
	        ArrayList<String> res = new ArrayList<>();

	        a.stream().filter((p) -> p.startsWith("a") && (p).length() == 3).map((p) -> p).forEach((p) -> res.add(p));
	        return res;
	    }
	
}
