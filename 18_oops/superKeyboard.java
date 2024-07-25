public class superKeyboard{
    public static void main(String args[]){
       Horses H = new Horses();
       System.out.println(H.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println(" animal constructor is called....");
    }
}

class Horses extends Animal{
    Horses(){
        super.color = "brown";
        System.out.println(" horses constructor called ...");
    }
}