package t2_bases;

public class Parcel09 {
    // Argument must be final to use inside
    // anonymous inner class:
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel09 p = new Parcel09();
        Destination d = p.destination("Tasmania");
    }
}

// A partir de Java 1.8, final no es necesario en el argumento