public class Oops{

    public static void main(String args[]){
      Pen p1 = new Pen();
      p1.setcolor("bhagwa");
      System.out.println(p1.color);

      p1.settip(5);
      System.out.println(p1.tip);

     // p1.setcolor("white");
     // or
     p1.color = "    white";
      System.out.println(p1.color);

      BankAccount myAcc = new BankAccount();
      myAcc.UserName = "prashant";
      System.out.println(myAcc.UserName);

      myAcc.setPassword("fjdksdmfnjk");
       

    }
}

class BankAccount{
    
     public   String UserName;
     private String password;

     public  void setPassword( String newPassword){
         password = newPassword;
     }
}

class Pen{
    // properties + functions
    String color;
    int tip;

    void setcolor( String newColor ){
        color = newColor;
    }

    void settip( int newTip ){
        tip = newTip;
    }
}