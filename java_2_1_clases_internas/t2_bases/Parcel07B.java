package t2_bases;

public class Parcel07B {
    class MyContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel07B p = new Parcel07B();
        Contents c = p.contents();
    }
}