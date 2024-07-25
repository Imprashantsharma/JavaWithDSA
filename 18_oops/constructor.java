public class constructor{
    public static void main(String args[]){
      Student s1 = new Student();
      Student s2 = new Student("Prashant");
      System.out.println(s2.name);

      Student s3 = new Student(123);
      System.out.println(s3.rollno);
    }
}

class Student{
     String name;
     int rollno;
     

     Student(){
         System.out.println(" construvctor is called.....");
     }

     Student(String name){
        this.name = name;
     }

     Student( int rollno){
       this.rollno = rollno;
     }

}