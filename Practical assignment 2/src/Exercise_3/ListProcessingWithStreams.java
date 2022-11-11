package Exercise_3;

import java.util.List;

public class ListProcessingWithStreams {
    public static void main(String[] args) {
        List<String> list;
        list = List.of(new String[]{"a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1"});
        for (var i: list) {
            if (i.startsWith("b")){
                System.out.println(i);
            }
        }
    }
}
