package lv.tsi.animals.Exercise7;

import lv.tsi.animals.Exercise6.Animal;

public class Dog implements Animal,Domestic {
    @Override
    public void sound(){
        System.out.println("Bark");
    }
    @Override
    public void printName(){
        System.out.println("Dogs’s name is " + name);
    }
    private String name;

    public void Dog(String name){
        this.name = name;
    }
}
