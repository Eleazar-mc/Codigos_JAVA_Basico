package b_interfaces_funcionales;

interface A1 {
    void m();
    int X = 10;
}

public class Lambda01 {
    public static void main(String[] args) {
        A1 a = () -> { // Los "()" corresponden con "m()"
            System.out.println("Lambda 1" + A1.X);
        };

        System.out.println(a);
        a.m();
        System.out.println(A1.X);
    }
}

// Declarar tipos internos en la interfaz y
// verificar que el funcionamiento no cambia
// Las constantes en una lambda se utilizan mediante un acceso estático,
// caso contrario, se genera un error al no tener implementado directamente
// el tipo de dato de la interfaz