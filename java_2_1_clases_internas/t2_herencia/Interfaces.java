package t2_herencia;

interface I1 {
    class C {
        void m() {
            System.out.println("I1.C.m()");
        }
    }
    static class A {
        void m() {
            System.out.println("I1.A.m()");
        }
    }
    interface Interna {
        void m();
    }
}

class Impl implements I1 {
    void m() {
        C c = new C();
        System.out.println(c);
        c.m();

        A a = new A();
        System.out.println(a);
        a.m();

        class X implements Interna {
            public void m() {
                System.out.println("Impl.X implements Interna");
            }
        }

        Interna x = new X();
        System.out.println(x);
        x.m();
    }
}

class Klase implements I1.Interna {
    public void m() {
        System.out.println("------");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        I1.A i = new I1.A();
        System.out.println(i);
        i.m();

        I1.C j = new I1.C();
        System.out.println(j);
        j.m();

        I1.Interna k = new I1.Interna() {
            public void m() {
                System.out.println("I1.Interna.m()");
            }
        };
        System.out.println(k);
        k.m();

        Impl im = new Impl();
        im.m();

        System.out.println(new Impl.C());
        System.out.println(new Impl.A());
        System.out.println(new Impl.Interna() {public void m() {}});
    }
}