package t2_herencia;

interface Ix1 {
    void m();
}

class Ax1 {
    static {
        System.out.println("Ax1.<clinit>");
    }
    {
        System.out.println("Ax1.<init>");
    }
    Ax1() {
        System.out.println("Ax1()");
    }
}

class Bx1 {
    class X extends Ax1 implements Ix1 { //Ax1 <- Bx1.X
        @Override
        public void m() {

        }
        {
            System.out.println("Bx1$X.<init>");
        }
        X() {
            System.out.println("Bx1$X()");
        }

    }
    static {
        System.out.println("Bx1.<clinit>");
    }
    {
        System.out.println("Bx1.<init>");
    }
    Bx1() {
        System.out.println("Bx1()");
    }
}

public class Caso1 {
    public static void main(String[] args) {
        new Bx1().new X();
    }
}