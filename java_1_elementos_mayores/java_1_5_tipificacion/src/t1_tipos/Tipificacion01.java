package t1_tipos;

interface PuedePelear {
    void pelear();
}

interface PuedeNadar {
    void nadar();
}

interface PuedeVolar {
    void volar();
}

class Accion {
    public void pelear() {
        System.out.println("¡Acción de pelear!");
    }
}

class Heroe extends Accion implements PuedePelear, PuedeNadar, PuedeVolar {
    public void nadar() {
        System.out.println("¡Héroe nadando!");
    }

    public void volar() {
        System.out.println("¡Héroe volando!");
    }
}
class Aventura {
    public static void t(PuedePelear x) {
        x.pelear();
    }
    public static void u(PuedeNadar x) {
        x.nadar();
    }
    public static void v(PuedeVolar x) {
        x.volar();
    }
    public static void w(Accion x) {
        x.pelear();
    }
}

public class Tipificacion01 {
        public static void main(String[] args) {
            Heroe h = new Heroe();
            Aventura.t(h);
            Aventura.u(h);
            Aventura.v(h);
            Aventura.w(h);

            h.nadar();
            h.pelear();
            h.volar();

            PuedeVolar pv = h;
            pv.volar();

            Accion a = h;
            a.pelear();

            PuedeNadar n = ((Heroe)a);
            n.nadar();
        }
}