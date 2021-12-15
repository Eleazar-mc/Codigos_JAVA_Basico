package c_referencias_metodos;

interface I3 {
    String m(String s, int i);
}

class C3 {
    String saludar(String nombre, int edad) {
        return "Hola " + nombre + ", tu edad es de " + edad + " años";
    }
    String m(String cad, int x) {
        return cad + " " + x;
    }
}

public class Referencias3 {
    public static void main(String[] args) {
        C3 c3 = new C3();
        I3 i3 = c3::saludar; // Referencia a método de instancia
        System.out.println(i3.m("Ivar Jacobson", 60));
        System.out.println(i3);

        i3 = c3::m;
        System.out.println(i3.m("Operación compleja", 100));
        System.out.println(i3);
    }
}