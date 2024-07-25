public class polymorphism{
    public static void main(String args[]){
      Calculator calc = new Calculator();
      System.out.println(calc.sum( 4, 5));
      System.out.println(calc.sum( 4.5f, 5.5f));
      System.out.println(calc.sum( 4, 5, 6));

      Deer D = new Deer();
      D.eat();
    }
}

//base class
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
                                                                               //RUN
                                                                               //TIME               ( METHED OVERRIDING)
                                                                               //POLYMORPHISM
//derived class
class Deer extends Animal{
    void eat(){
           System.out.println("eat grass");
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a,float b){                              //compile time polymorphism( method overloading)
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}