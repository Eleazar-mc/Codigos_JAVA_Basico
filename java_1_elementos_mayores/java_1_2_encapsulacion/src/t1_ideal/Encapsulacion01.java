package t1_ideal;

class Punto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Punto3D extends Punto {
    private double z;

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}

public class Encapsulacion01 {
    public static void main(String[] args) {
        System.out.println(new Punto());
        System.out.println(new Punto3D());
    }
}

//¿Qué sucede si se cambia la visibilidad a protected de los métodos get/set de Punto?