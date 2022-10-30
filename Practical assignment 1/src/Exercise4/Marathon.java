package Exercise4;

public class Marathon {
    private static String [] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    private static int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265};
    public static void printResults(){
        for (int i = 0; i < times.length; i++){
            System.out.println(names[i] + " " + times[i] + '\n');
        }
    }
}
