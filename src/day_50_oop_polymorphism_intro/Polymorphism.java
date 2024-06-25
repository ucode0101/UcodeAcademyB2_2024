package day_50_oop_polymorphism_intro;

public class Polymorphism {

 public static void main(String[] args) {

  //normal way we create
  DogClass dogClass = new DogClass();
  CatClass catClass = new CatClass();

  // Parent class reference refers to child class's object
  // There must be IS-A relationship (inheritance)
  AnimalClass obj1 = new DogClass();
  AnimalClass obj2 = new CatClass();

  // Grandparent class's reference refers to grand-child class's object
  // There must be IS-A relationship (inheritance)
  Creature obj3 = new DogClass();
  Creature obj4 = new CatClass();

  // using Object class's reference
  Object obj5 = new DogClass();
  Object obj6 = new CatClass();

  Object[] animals = {dogClass, catClass, obj1,obj2,obj3, obj4, obj5,obj6};





 }


}




class Creature{

}
 class AnimalClass extends Creature{

}

class DogClass extends AnimalClass{

}

class CatClass extends AnimalClass{

}
