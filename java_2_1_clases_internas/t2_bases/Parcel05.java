package t2_bases;

public class Parcel05 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel05 p = new Parcel05();
        Destination d = p.destination("Tasmania");
        System.out.println(d);
        System.out.println(d.readLabel());
        Ajena.m();
    }
}

class Ajena {
    static void m() {
        System.out.println(new Parcel05().destination("México").readLabel());
    }
}