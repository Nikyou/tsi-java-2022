package Exercise3;

import java.util.Arrays;
import java.util.OptionalDouble;

import static java.util.Arrays.setAll;

public class OneDimensionalArray {
    public static double[] createRandomArray (int size){
        double[] array = new double[size*size];
        setAll(array, (index) -> Math.random() * (100));
        return array;
    }
    public static double mean(double[] array){
        double[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);
        int pos = temp.length / 2;
        return temp[pos-1];
    }

    public static void main(String[] args) {
        double[] array = createRandomArray(3);
        double min = 101;
        double max = -1;
        double average = mean(array);
        for (double v: array){
            if (v < min){
                min = v;
            }
            if (v > max){
                max = v;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Minimal value: " + min + "\nMaximal value: " + max + "\nAverage value: " + average);
    }
}
