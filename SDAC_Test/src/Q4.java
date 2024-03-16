class F{
	void num(int x){
		System.out.println(x);
	}
}

class E extends F{
	void num(int X){
		System.out.println(X);
	}

}
public class Q4 {
	public static void main(String[] args) {
			System.out.println("Hello World!");
            E ob = new E();
			ob.num(40);
			ob.num(50);
		}
}