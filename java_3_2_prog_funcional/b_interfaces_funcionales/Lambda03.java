package b_interfaces_funcionales;

interface A3 {
    void m();
}

public class Lambda03 {
    public static void main(String[] args) {
        A3 a = () -> System.out.println("Lambda 3");

        System.out.println(a);
        a.m();

        // nueva implementación anónima
        a = () -> System.out.println("Lambda 3 " + 3);

        System.out.println(a);
        a.m();
    }
}