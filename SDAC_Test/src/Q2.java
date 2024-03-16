class abc {
	String studentname = "jui";
	int rollnumer = 4610;
	static String collegename = "thakur";

	void displayInfo() {
		System.out.println(studentname);
		System.out.println(rollnumer);
	
	}
	static void showcollegeName(){
		System.out.println(collegename);
	}
}
public class Q2 {
	public static void main(String[] args) {
		System.out.println("hello");
		abc o = new abc();
		o.displayInfo();
		abc.showcollegeName();
	}
}
