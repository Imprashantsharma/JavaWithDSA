public class inheritance{
    public static void main(String args[]){
      Mammel men = new Mammel();
      men.eat();

      Fish Shark = new Fish();
      Shark.breath();
    }
}

//BASE CLASS
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

//DERIVED CLASS
class Mammel extends Animal{
   void walk(){
       System.out.println("walks");
   }
}

//DERIVED CLASS
class Bird extends Animal{
    void fly(){
         System.out.println("flies");
    }
}

//DERIVED CLASS
class Fish extends Animal{
    void swim(){
         System.out.println("swim");
    }
}
