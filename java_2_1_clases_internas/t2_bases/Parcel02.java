package t2_bases;

public class Parcel02 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel02 p = new Parcel02();
        p.ship("Tasmania");
        Parcel02 q = new Parcel02();
        // Defining references to inner classes:
        Parcel02.Contents c = q.contents();
        Parcel02.Destination d = q.to("Borneo");
    }
}