package t2_herencia;

class Ex { ///// E
    static {
        System.out.println("E.<clinit>");
    }
    {
        System.out.println("E.<init>");
    }
    Ex() {
        System.out.println("E()");
    }

    class X { ///// Ex.X
        {
            System.out.println("E.X.<init>");
        }
        X() {
            System.out.println("E.X()");
        }
    }
}

class Fx extends Ex.X { //////// Ex.X <- Fx
    static {
        System.out.println("F.<clinit>");
    }
    {
        System.out.println("F.<init>");
    }
    Fx() {
        new Ex().super();
        System.out.println("F()");
    }
}

class Caso4 {
    public static void main(String[] args) {
        new Fx();
    }
}