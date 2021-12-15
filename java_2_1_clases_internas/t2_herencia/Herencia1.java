package t2_herencia;

//Caso 1
interface I { // I
}

class A { // A
}

class B { // B
    class X extends A implements I { // B.X -> A
    }
}

//Caso 2
class C {
    class X extends C {
    }
}

//Caso 3
class D extends A {
    class X extends D {
    }
}

//Caso 4
class E {
    class X {
    }
}

class F extends E.X {
    F() {
        new E().super();
    }

    void m() {
    }
}

//Caso 5
class G {
    class X {
    }
}

class H extends G {
    class Y extends G.X {
    }
}

public class Herencia1 {
    public static void main(String[] args) {
        // 1) Decir la tipificación de cada clase
        // 2) Hacer ejemplos de instanciación para cada clase.
        // 3) Mostrar las capacidades de upcasting y downcasting.
        // 4) Explicar el proceso de construcción para cada caso
    }
}