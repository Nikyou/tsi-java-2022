package lv.tsi.animals.Exercise7;

import lv.tsi.animals.Exercise6.Animal;

public class Cat implements Animal, Domestic {
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    @Override
    public void printName(){
        System.out.println("Cat’s name is " + name);
    }
    private String name;

    public void Cat(String name){
        this.name = name;
    }
}
