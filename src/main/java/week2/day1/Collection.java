package week2.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		
	List<String> Values=new ArrayList<String>();
	List<String> Names=new ArrayList<String>();
	//add the values 
	Values.add("Vignesh");
	Values.add("Nagarajan");
	Values.add("Valarmathi");
	Values.add("Vignesh");
	//remove name	
	//Values.remove(3);
	
	//Add the all values of names
	Names.addAll(Values);
	
	int size=Values.size();
	System.out.println(size);
	System.out.println(Values);
	
	//Ascending
	Collections.sort(Names);
	
	for (String newValues: Names)
	{
	System.out.println(newValues);
	}	
	System.out.println("*********");
	//descending
	Collections.sort(Names);
	Collections.reverse(Names);

	for (String newNames : Names) {
		System.out.println(newNames);
	}
	}
	
}
