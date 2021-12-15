package t2_herencia;

//Caso 1
interface I5 {
}

class A5 {
}

class B5 {
    static class X extends A5 implements I5 {
    }
}

//Caso 2
class C5 {
    static class X extends C5 {
    }
}

//Caso 3
class D5 extends A5 {
    static class X extends D5 {
    }
}

//Caso 4
class E5 {
    static class X {
    }
}

class F5 extends E5.X {
}

//Caso 5
class G5 {
    static class X {
    }
}

class H5 extends G5 {
    class Y extends G5.X {
    }
}

//Caso 6
class J5 {
    static class X {
    }
}

class K5 extends J5 {
    static class Y extends J5.X {
    }
}

public class Herencia3 {
    public static void main(String[] args) {
        // 1) Hacer ejemplos de instanciación para cada clase.
        // 2) Mostrar las capacidades de upcasting y downcasting.
        // 3) Decir la tipificación de cada clase
        // 4) Explicar el proceso de construcción para cada caso
    }
}