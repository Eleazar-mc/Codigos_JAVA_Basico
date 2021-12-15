package a_interfaces_default;

interface I1 {
    default void m() { // método de extensión
        System.out.println("Hola 1");
    }
}

interface I2 {
    default void p() { // método de extensión
        System.out.println("Hola 2");
    }
}

public class Default1 implements I1, I2 {
    public static void main(String[] args) {
        Default1 d = new Default1();
        d.m();
        d.p();

        I1 i = d;
        i.m();
        ((Default1)i).p();

        I2 j = d;
        j.p();
    }
}

// ¿Los métodos default son herencia múltiple?