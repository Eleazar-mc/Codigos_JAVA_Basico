package t2_abstractas;

abstract class Instrumento {
    abstract void tocar();
}

class Viento extends Instrumento {
    public void tocar() {
        System.out.println("Viento.tocar()");
    }
}

class Percusion extends Instrumento {
    public void tocar() {
        System.out.println("Percusion.tocar()");
    }
}

public class Abstraccion02 {
    public static void tono(Instrumento i) {
        i.tocar();
    }
    public static void main(String[] args) {
        Instrumento[] is = { new Viento(), new Percusion() };
        for(Instrumento i: is)
            tono(i);
//        new Instrumento();
    }
}