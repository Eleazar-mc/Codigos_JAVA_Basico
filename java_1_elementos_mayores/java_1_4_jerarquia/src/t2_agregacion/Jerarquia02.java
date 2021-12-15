package t2_agregacion;

import java.util.ArrayList;
import java.util.List;

class Planta {}

class Jardin {
    List plantas = new ArrayList();
    
    Jardin(Planta... ps) {
        for(Planta p : ps)
            plantas.add(p);
    }

    void planCrecimiento(Planta... ps) {
        for(Planta p : ps)
            plantas.add(p);
    }
}

public class Jerarquia02 {
    public static void main(String[] args) {
        Jardin j1 = new Jardin();
        Jardin j2 = new Jardin(new Planta(), new Planta(), new Planta(), new Planta());

        System.out.println(j1.plantas);
        System.out.println(j2.plantas);

        j1.planCrecimiento(new Planta());
        j2.planCrecimiento(new Planta(), new Planta(), new Planta());

        System.out.println(j1.plantas.size());
        System.out.println(j2.plantas.size());
    }
}
