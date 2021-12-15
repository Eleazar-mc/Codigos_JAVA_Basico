package e_streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Stream08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        System.out.println(numeros.stream().mapToInt(x -> x));
        System.out.println(numeros.stream().mapToInt((x) -> x).summaryStatistics());

        IntSummaryStatistics estadisticas = numeros.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Conteo de números:" + estadisticas.getCount());
        System.out.println("Valor máximo: " + estadisticas.getMax());
        System.out.println("Valor mínimo: " + estadisticas.getMin());
        System.out.println("Sumatoria: " + estadisticas.getSum());
        System.out.println("Promedio: " + estadisticas.getAverage());
    }
}