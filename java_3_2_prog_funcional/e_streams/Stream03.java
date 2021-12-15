package e_streams;

import java.util.Random;

public class Stream03 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}

// ints() genera una lista infinita
// Quitar limit() y observar