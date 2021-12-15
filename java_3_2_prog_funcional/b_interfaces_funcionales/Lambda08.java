package b_interfaces_funcionales;

interface A8 {
    int suma(int a, int b);

    default String m() { // sin problema, no se rompe la regla funcional
        return "Default";
    }

    default int f(int x) {
        return x + 1;
    }
}

public class Lambda08 {
    public static void main(String args) {
        A8 f = (x, y) -> x + y;
        System.out.println(f.suma(4,9));
        System.out.println(f.m());
    }
}

// En Haskell:
// (\x y -> x + y) 4 9
//
// let f = (\x y -> x + y)
// f 4 9

// Investigar qué es y para qué sirve el Cálculo Lambda