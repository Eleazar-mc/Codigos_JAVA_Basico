package c_referencias_metodos;

interface I2 {
    double m(int i);
}

class C2 {
    static double p(int i) {
        return i*3.33;
    }
    static double q(int i) {
        return i*4.44;
    }
//	static double m(int i) {
//		return i*2.22;
//	}
}

public class Referencias2 {
    public static void main(String[] args) {
        I2 i2 = (x) -> x*2;
        System.out.println(i2.m(19));

        i2 = C2::q; // No se requiere especificar argumentos
        System.out.println(i2.m(5));
    }
}

// ¿Funcionará el método estático m()?