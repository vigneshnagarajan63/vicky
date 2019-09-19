package week1.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class Sample {

	public static void main(String[] args) {
		String[] allName = {"Sam","Raj","sarath","Raj"};
		allName[0] = "";
	String name = "Saratha";
	
	//key , value
	Map<Character,Integer> map =new HashedMap<Character, Integer>();

	char[] charArray = name.toCharArray();
	for (char eachChar: charArray) {
		if (!map.containsKey(eachChar)) {
			map.put(eachChar, 1);
		} else {
			Integer value = map.get(eachChar);
			map.put(eachChar, value+1);
		}
		
	}
	System.out.println(map);
	/*
	 * put(K,V)
	 * get(k)
	 * remove(k)
	 * clear();
	 * 
	 * 
	 * s=1
	 * a=1
	 * r=1
	 * t=1
	 * h=1
	 * 
*/	
	

	
		
		
		
		
		
		
		/*for (int i = 0; i < allName.length; i++) {
			for (int j = i+1; j < allName.length; j++) {
				if (allName[i].equals(allName[j])) {
					System.out.println(allName[i]);
					
				}
			}*/
		}
	










/*protected void displaySample() {
	System.out.println("sample");*/

}



}
