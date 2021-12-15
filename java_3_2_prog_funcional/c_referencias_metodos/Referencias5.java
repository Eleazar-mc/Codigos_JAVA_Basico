package c_referencias_metodos;

import static java.lang.System.out;

interface I5 {
    public void m();
}

public class Referencias5 {
    public static void p() {
        out.println("p()");
    }
    public static void main(String... args) {
        I5 i5 = Referencias5::p;
        i5.m();

        ((I5) Referencias5::p).m();

        ((I5)() -> Referencias5.p()).m();
    }
}