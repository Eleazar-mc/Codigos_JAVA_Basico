package t1_concretas;

class Instrumento {
    public void tocar() {
        System.out.println("Instrumento.tocar()");
    }
}

class Viento extends Instrumento {
    public void tocar() {
        System.out.println("Viento.tocar()");
    }
}

public class Abstraccion01 {
    public static void tono(Instrumento i) {
        i.tocar();
    }
    public static void main(String[] args) {
        Viento v = new Viento();
        tono(v);
//        new Instrumento().tocar(); // ¿Qué instrumento es?
    }
}