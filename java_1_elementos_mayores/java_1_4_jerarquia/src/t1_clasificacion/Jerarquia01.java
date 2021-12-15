package t1_clasificacion;

interface Planta {}
interface Flor {}
interface FrutaVegetal {}

class Rosa implements Planta, Flor {}
class Zanahoria implements Planta, FrutaVegetal {}
class Arbol implements Planta, Flor, FrutaVegetal {}

public class Jerarquia01 {
    public static void main(String[] args) {
        Flor f = new Rosa();
        System.out.println(f);
        Planta p = (Rosa)f;
        System.out.println(p);

        p = new Arbol();
        System.out.println(p);
        f = (Arbol)p;
        System.out.println(f);
        FrutaVegetal v = (Arbol)p;
        System.out.println(v);

        v = new Zanahoria();
        System.out.println(v);
        p = (Zanahoria)v;
        System.out.println(p);
    }
}