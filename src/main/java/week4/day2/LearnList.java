package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//list is maintain the insertion order, FIFO
		List<String> name=new ArrayList<String>();
		List<String> num=new ArrayList<String>();
		name.add("Vignesh");
		name.add("Karun");
		name.add("Balaji");
		name.add("Vignesh");
		
		num.addAll(name);
		//name.remove(0);
	
		int size = name.size();
		System.out.println(size);
		System.out.println(name);
		Collections.sort(name);
		
		
		for (String string : name) {
			System.out.println(string);
		}
		

	}

}
