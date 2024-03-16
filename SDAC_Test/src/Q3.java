class D
{
	void num(int x){
		System.out.println(x);
	}

	void num(int X, int Y){
		System.out.println(X+Y);
	}
}


public class Q3 {
	public static void main(String[] args) {
			System.out.println("Hello World!");
            D ob = new D();
			ob.num(40);
			ob.num(40,50);
		}
}
