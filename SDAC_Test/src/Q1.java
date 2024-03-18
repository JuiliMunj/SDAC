class Emp {
    String name = "ABC";
    int id = 1;
    double salary = 10200;
    String address = "xyz";

    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nSalary: " + salary + "\nAddress: " + address;
    }
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Emp e = new Emp();
        System.out.println(e.toString());
    }
}
