package Exercise_5.lv.tsi.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonEvaluator {
    List<Person> persons;
    public PersonEvaluator(List<Person> persons){
        this.persons = persons;
    }
    public void findAndPrint(String str){   //Prints names that starts with
        // str, case-sensitive
        for (var i: this.persons) {
            if (i.name.startsWith(str)){
                System.out.println(i.name);
            }
        }
    }
    public void findAndPrint(int age, int option){    //Prints names of age,
        // option < 0 => less than; option == 0 => equals; option > 0 =>
        // greater than
        boolean lessOption = option < 0;
        boolean equalOption = option == 0;
        boolean greaterOption = option > 0;
        for (var i: this.persons) {
            if (lessOption){
                if (i.age < age){
                    System.out.println(i.name);
                }
            }
            if (equalOption){
                if (i.age == age){
                    System.out.println(i.name);
                }
            }
            if (greaterOption){
                if (i.age > age){
                    System.out.println(i.name);
                }
            }
        }
    }

    public void groupByAgeAndPrint(){
        ArrayList<Person> sublist = new ArrayList<>(persons);
        sublist.sort(Comparator.comparingInt(i -> i.age));
        int curAge = 0;
        for (var i: sublist) {
            if (curAge == i.age){
                System.out.printf(", %s", i.name);
            }
            if (curAge != i.age){
                if (curAge == 0){
                    System.out.printf("Age %s: [%s", i.age, i.name);
                } else {
                    System.out.printf("]\nAge %s: [%s", i.age, i.name);
                }
                curAge = i.age;
            }
        }
        System.out.println("]");
    }
    public void groupByNameAndPrint(){
        ArrayList<Person> sublist = new ArrayList<>(persons);
        sublist.sort((i1, i2) -> i1.name.compareTo(i1.name));
        String curName = "";
        for (var i: sublist) {
            if (curName == i.name){
                System.out.printf(", %s", i.age);
            }
            if (curName != i.name){
                if (curName == null){
                    System.out.printf("Name %s: [%s", i.name, i.age);
                } else {
                    System.out.printf("]\nName %s: [%s", i.name, i.age);
                }
                curName = i.name;
            }
        }
        System.out.println("]");
    }
    public double getAverageAge(){
        long allAge = 0L;
        for (var i: persons) {
            allAge += i.age;
        }
        return (double) allAge/persons.size();
    }
}
