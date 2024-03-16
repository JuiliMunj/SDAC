class Emp {
	String name = "ABC";
	int id = 1;
	double salary = 10200;
	String address = "xyz";

	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(address);
	}
}
public class Q1 {
public static void main(String[] args) {
	System.out.println("helloworld");
	Emp e = new Emp();
	e.displayInfo();
   }
}


