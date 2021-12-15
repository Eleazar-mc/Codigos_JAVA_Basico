package b_interfaces_funcionales;

class L07 {
    interface A7 {
        double potencia(double x, double y); // descriptor de función
    }
}

public class Lambda07 {
    public static void main(String[] args) {
        L07.A7 a = (double x, double y) -> Math.pow(x, y);
        System.out.println(a.potencia(6, 2));

        a = (double x, double y) -> { // llaves obligatorias usando return
            return Math.pow(x, y);
        };
        System.out.println(a.potencia(6, 3));
    }
}