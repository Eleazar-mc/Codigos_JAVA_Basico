package t3_interfaces;

interface Instrumento {
    void tocar();
}

class Viento implements Instrumento {
    public void tocar() {
        System.out.println("Viento.tocar()");
    }
}

class Percusion implements Instrumento {
    public void tocar() {
        System.out.println("Percusion.tocar()");
    }
}

class Cuerda implements Instrumento {
    public void tocar() {
        System.out.println("Cuerda.tocar()");
    }
}

public class Abstraccion03 {
    public static void tono(Instrumento i) {
        i.tocar();
    }
    public static void main(String[] args) {
        Instrumento[] is = { new Viento(), new Percusion(), new Cuerda() };
        for(Instrumento i: is)
            tono(i);
    }
}