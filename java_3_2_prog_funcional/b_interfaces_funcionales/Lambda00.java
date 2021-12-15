package b_interfaces_funcionales;

interface A0 { // Interfaz funcional - sólo debe tener un método abstracto
    void m();
    int X = 10;
}

public class Lambda00 {
    public static void main(String[] args) {
        A0 a = new A0() {
            public void m() {
                System.out.println("Lambda 0" + X);
            }
        };

        System.out.println(a);
        a.m();
        System.out.println(A0.X);
    }
}