abstract class A {

	static void meth1() {
		System.out.println("static");
	}

	void meth2() {
		System.out.println("non static");
	}

	abstract void meth3();

}

class B extends A {
	@Override
	void meth3() {
		System.out.println("abstract");

	}

}

public class Q5{
	public static void main(String[] args) {
		B b = new B();
		b.meth2();
		b.meth3();
		B.meth1();
	}
}


