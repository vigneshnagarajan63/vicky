package week2.day1;

public class Overloading {
	public void add(int a,int b) {
		System.out.println(a+b);

	}
	public void add(double a,double b) {
		System.out.println(a+b);

	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);

	}
	public void empInfo(String name,int phone) {
		System.out.println(name+"-"+phone);

	}
	public void empInfo(int id,String email) {
		System.out.println(id+"-"+email);

	}
	
	public static void main(String[] args) {
		Overloading lmo=new Overloading();
		lmo.add(25, 35);
		lmo.add(25.35, 35.25);
		lmo.add(25, 35, 45);
		lmo.empInfo("hari", 345345);
}
	
}
