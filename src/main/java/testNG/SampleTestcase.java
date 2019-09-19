package testNG;

import org.testng.annotations.Test;

public class SampleTestcase {
 @Test(enabled=true)
	public void highSchool(){
		System.out.println("Start the car");
	}
 @Test(dependsOnMethods="highSchool")
		public void higherSecSchool(){
			System.out.println("First Gear");
		}
 @Test(dependsOnMethods="higherSecSchool")
 	public void diplomaEce() {
 		System.out.println("turnd on");
 	}
 @Test (dependsOnMethods="diplomaEce")
		public void engineering(){
			System.out.println("Sec Gear");
	}
 @Test(dependsOnMethods="engineering")
 public void PG(){
		System.out.println("Third Gear");
 }
}
