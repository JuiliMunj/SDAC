interface I {
    int a = 10; 

    void meth(); 
}

class G implements I {
    @Override
    public void meth() {
        System.out.println("interface method implementation");
    }
}

public class Q6 {
    public static void main(String[] args) {
        System.out.println("hello world");
        G ob = new G();
        ob.meth();
    }
}

