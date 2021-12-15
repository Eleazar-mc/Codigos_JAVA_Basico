package t2_bases;

class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}

public class Parcel08 {
    public Wrapping wrapping(int x) {
        // Base constructor call:
        return new Wrapping(x) { // Pass constructor argument.
            public int value() { // Override
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel08 p = new Parcel08();
        Wrapping w = p.wrapping(10);
    }
}