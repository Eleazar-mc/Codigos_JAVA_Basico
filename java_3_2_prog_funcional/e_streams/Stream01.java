package e_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a.stream());
        System.out.println(a.stream().count());
        System.out.println(a.stream().collect(Collectors.toList()));
    }
}