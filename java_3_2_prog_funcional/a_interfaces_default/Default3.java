package a_interfaces_default;

interface Face1 {
    default void m() {
        System.out.println("Face1.m()");
    }
}

interface Face2 {
    default void m() {
        System.out.println("Face2.m()");
    }
}

public class Default3 {} //implements Face1, Face2 { //error, colisión
//	public static void main(String[] args) {
//		new Default3().m();
//	}
//}

//La única forma de evitar la colisión es redefiniendo
//una nueva versión del método m():
//
//public void m() {
//	System.out.println("Default3.m()");
//	Face1.super.m();
//}
