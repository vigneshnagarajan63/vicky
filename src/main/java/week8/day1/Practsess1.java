package week8.day1;

import org.testng.annotations.Test;

public class Practsess1 {

	String str="vignesh@1234";
	@Test
	public void approch1() {
		System.out.println("NO of char capitalletter "+str.replaceAll("[^A-Z]" ,"").length());
		System.out.println("NO of char smalllet "+str.replaceAll("[^a-z]" ,"").length());
		System.out.println("NO of char numeric dig "+str.replaceAll("[^0-9]" ,"").length());
		System.out.println("NO of char spec Ch "+str.replaceAll("[^A-Za-z0-9]" ,"").length());
	}
	@Test
	
	public void approch2() {
		char[] ch=str.toCharArray();
		int ucase=0;
		int lcase=0;
		int numlog=0;
		int specch=0;
		for(Character c :ch) {
			if(c.isUpperCase(c));
			ucase++;
			
		}
		
	}
}