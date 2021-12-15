package a_interfaces_default;

interface Faz1 {
    static void m() {
        System.out.println("Hola");
    }
}

interface Faz2 {
    default void m() {
        System.out.println("Adios");
    }
}

interface Faz3 {
//	void m() { //error, método no válido, debe ser abstracto
//		System.out.println("Que tal");
//	}
}

public class Default2 {
    public static void main(String[] args) {
        Faz1.m();
//		Faz2.m(); //error, no hay instancia para invocar
    }
}