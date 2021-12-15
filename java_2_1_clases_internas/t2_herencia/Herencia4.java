package t2_herencia;

class AA {
    public void m() {
        System.out.println("AA.m()");
    }
}

class BB {
    public void p() {
        System.out.println("BB.p()");
    }

    class CC extends AA {
        public void p() { //envolvente
            BB.this.p();
        }
    }
}

public class Herencia4 {
    public static void main(String[] args) {
        BB.CC cc = new BB().new CC();
        cc.m();
        cc.p();
    }
}

// ¿Cuál es la solución para 3, 4, 5, 6 y 7 súper clases?
// NOTA: un problema real con más de 3 súper clases es un mal diseño