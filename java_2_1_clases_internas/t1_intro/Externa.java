package t1_intro;

public class Externa {
    class Interna {}

    static class Anidada {}

    public static void main(String[] args) {
        System.out.println(new Externa().new Interna());
        System.out.println(new Externa.Anidada());
    }
}