package week1.day1;

public class Bike {
	public static void applyBreak() {
		System.out.println("Applied Break");
	}
public static void soundHorn() {
	System.out.println("Sound Horn");
}
public static void main(String[] args) {
	Car obj=new Car();
	obj.applyBreak();
	obj.soundHorn();
	Bike obj2=new Bike();
	obj2.applyBreak();
	obj2.soundHorn();
	
}
	
	
	

}
