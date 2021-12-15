package c_referencias_metodos;

interface I1 {
    double m();
}

public class Referencias1 {
    public static void main(String[] args) {
        I1 i1 = () -> Math.random();
        System.out.println(i1.m());
        System.out.println(i1);

        i1 = Math::random; // Referencia a método estático
        System.out.println(i1.m());
        System.out.println(i1);
    }
}