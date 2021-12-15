package t2_bases;

public class Parcel03 {
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

    public static void main(String[] args) {
        Parcel03 p = new Parcel03();
        Parcel03.Contents c = p.new Contents();
        Parcel03.Destination d = p.new Destination("Tasmania");
    }
}