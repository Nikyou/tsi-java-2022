package Exercise_5.lv.tsi.lambda;

import java.util.List;

public class PersonProcessingWithStreams {
    public static void main(String[] args) {
        List<Person> list;
        list = List.of(new Person[]{new Person("Max", 28), new Person("Peter", 22),
            new Person("Anna", 28), new Person("Lilianna",16),
            new Person("Pamela", 13), new Person("David", 22)});
        PersonEvaluator evaluator = new PersonEvaluator(list);
        System.out.println("Names starting from \"P\"");
        evaluator.findAndPrint("P");
        System.out.println("Names of people older than 18 years");
        evaluator.findAndPrint(18, 1);
        System.out.println("Group by age");
        evaluator.groupByAgeAndPrint();
        System.out.println("The average age of all people");
        System.out.println(evaluator.getAverageAge());
    }
}
