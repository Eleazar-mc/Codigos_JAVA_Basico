package b_interfaces_funcionales;

interface A2 {
    void m();
}

public class Lambda02 {
    public static void main(String[] args) {
        A2 a = () -> System.out.println("Lambda 2"); // se eliminan llaves

        System.out.println(a);
        a.m();
    }
}