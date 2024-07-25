public class abstractClass{
    public static void main(String args[]){
      Mustang m = new Mustang();
    
       
    }
}

abstract class Animal{
     String color;

    Animal(){
         System.out.println("animal constructor called....");
    }

    void eat(){
        System.out.println("animal eats");
    }
    
    abstract void walk();
}

class Horse extends Animal{

    Horse(){
          System.out.println("Horse constructor called....");
    }

    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("horse walk on 4 legs");
    }
}

class Mustang extends Horse{

      Mustang(){
          System.out.println("Mustang constructor called....");
    }
    
}

class Chicken extends Animal{

     void changeColor(){
        color = "yellow";
    }

     void walk(){
        System.out.println("horse walk on 2 legs");
    }
}