package b_interfaces_funcionales;

interface A4 {
    void m();
}

public class Lambda04 {
    public static void main(String[] args) {
        A4 a = () -> {
            System.out.println("Lambda 4");
            System.out.println(new java.util.Date());
        };

        System.out.println(a);
        a.m();
    }
}

// Si se quitan las llaves, no da error