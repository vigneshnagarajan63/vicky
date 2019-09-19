package week4.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class LearnMap {

	public static void main(String[] args) {
		
		String Txt="testleaf";
		char [] ch=Txt.toCharArray();
		Map<Character,Integer> Values=new HashMap<Character,Integer>();
		
		for (char newChar : ch) {
			if(Values.containsKey(newChar)) {
				Values.put(newChar, Values.get(newChar)+1);
				
			}else {
				Values.put(newChar, 1);
			}
				System.out.println(Values);
		}
	}
}
		/*
		studentInfo.put(10, "Hari");
		studentInfo.put(10, "Vignesh");
		studentInfo.put(10, "Prasad");
		studentInfo.put(30, "Hari");
		studentInfo.put(20, "Keerthy");
		
		System.out.println(studentInfo);
		*/