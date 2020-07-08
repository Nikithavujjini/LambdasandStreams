package LambdasandStreamsTask.LambdasandStreams;
import java.util.*;
public class Task1 {
 public static void main(String args[]) {
	 List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println(calculateaverage(a));
 }
 static Double calculateaverage(List<Integer>a) {
	 return  a.stream().mapToInt(val -> val).average().orElse(0.0);
 }
}
