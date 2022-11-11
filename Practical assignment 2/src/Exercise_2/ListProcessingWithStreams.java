package Exercise_2;

import java.util.List;

public class ListProcessingWithStreams {
    public static void main(String[] args) {
        List<String> list;
        list = List.of(new String[]{"a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1"});
        for (var i: list) {
            System.out.println(i.toUpperCase());
        }
    }
}
