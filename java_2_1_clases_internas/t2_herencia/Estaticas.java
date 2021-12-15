package t2_herencia;

class Ext {
    static class I {
        static class J {}
        class I2 {
            class I3 {
                class I4 {}
            }
        }
    }
}

public class Estaticas {
    public static void main(String[] args) {
        Ext.I ei = new Ext.I();
        System.out.println(ei);
    }
}
