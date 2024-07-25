public class GetAndSet{
    public static void main(String args[]){
       Pen p1 = new Pen();
      p1.setcolor("bhagwa");
      System.out.println(p1.getcolor());

      p1.settip(5);
      System.out.println(p1.gettip());

     // p1.setcolor("white");
     // or
     p1.setcolor("white");
      System.out.println(p1.getcolor());
    }
}

class Pen{
    
    private  String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    
    int gettip(){
        return this.tip;
    }
    void setcolor( String newColor ){
        color = newColor;
    }

    void settip( int newTip ){
        tip = newTip;
    }
}