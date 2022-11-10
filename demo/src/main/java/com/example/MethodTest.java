package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implement a generic method called count() to count the number of elements in
 * a list of generic elements. Inside the main() method create an ArrayList of 5
 * String objects, 6 Integer objects, and 8 Double objects. Make three different
 * calls to the count() method, once for each of the three lists, and print the
 * result to command line
 * Lam Vinh Vong
 */

public class MethodTest {

	public static <T> int count(List<T> list){
		 
	        
	        return list.size();
	    }	
	
	public static  void main(String[] args) {
		List<String> strObj = Arrays.asList( "a", "b", "c", "d", "e");
		List<Integer> intObj = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Double> doubleObj = Arrays.asList(1.2, 2.4, 4.9, 3.4, 5.4, 6.7, 7.3, 8.0 );

		ArrayList<String> strList = new ArrayList<>(strObj);
		ArrayList<Integer> intList = new ArrayList<>(intObj);
		ArrayList<Double> doubleList = new ArrayList<>(doubleObj);
		
		System.out.println("String:" + strList+ "\nInteger:"+ intList +"\nDouble:"+ doubleList);
		System.out.println("The number of items in the String list: "+ count(strList));
		System.out.println("The number of items in the Int list: "+ count(intList));
		System.out.println("The number of items in the double list: " +count(doubleList));

		

		
	}

}
