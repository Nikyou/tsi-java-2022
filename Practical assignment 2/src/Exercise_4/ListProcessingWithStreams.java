package Exercise_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProcessingWithStreams {
    public static void main(String[] args) {
        List<String> list;
        list = List.of(new String[]{"a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1"});
        List<String> sublist = new ArrayList<>();
        for (var i: list){
            if (i.startsWith("c")){
                sublist.add(i);
            }
        }
        Collections.sort(sublist);
        for (var i: sublist){
            System.out.println(i.toUpperCase());
        }
    }
}
