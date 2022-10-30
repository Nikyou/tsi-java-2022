package lv.tsi.animals.Exercise7;

import lv.tsi.animals.Exercise6.Animal;

public class Fox implements Animal, Wild {
     @Override
     public void sound(){
         System.out.println("Wa-pow");
     }
     @Override
    public void relax(){
         System.out.println("Fox is relaxed = " + relaxed);
    }
     private boolean relaxed;

     public void Fox(boolean relaxed){
         this.relaxed = relaxed;
     }
}
