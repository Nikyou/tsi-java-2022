package Exercise5;

import java.util.Arrays;

import static java.util.Arrays.setAll;

public class TwoDimensionalArray {

    public static int[] createRandomArray (int size){
        int[] array = new int[size];
        setAll(array, (index) -> (int) (Math.random() * (100)));
        return array;
    }

    public static int mean(int[] array){
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        int pos = temp.length / 2;
        return temp[pos-1];
    }
    public static void print(int[] array){
        System.out.println(Arrays.toString(array));
        System.out.println("Average value: " + mean(array));
    }
}
