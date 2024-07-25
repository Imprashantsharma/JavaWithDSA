public class CopyConstructor{
    public static void main(String args[]){
       Student s1 = new Student();
       s1.name = "prashant";
       s1.roll = 123;
       s1.passsword = "abcd";
       s1.marks[0] = 100;
       s1.marks[1] = 95;
       s1.marks[2] = 85;


       Student s2 = new Student(s1);
       s2.passsword = "xyz";
       s1.marks[2] = 90;

       for(int i=0; i<3; i++){
           System.out.println(s2.marks[i]);
       }
    }
}

class Student{

    String name;
    int roll;
    String passsword;
    int marks[];

     Student(){
          marks = new int[3];
        System.out.println("sedrftgyhu");
    }
    
    /* shallow copy constructor
       Student(Student S1){
           marks = new int[3];
           this.name = s1.name;
           this.roll = s1.roll;
           this.marks = s1.marks; */
     
     //DEEP COPY CONSTRUCTOR
     Student(Student s1){
           marks = new int[3];
          this.name = s1.name;
          this.roll = s1.roll;
          for(int i=0; i<marks.length; i++){
              this.marks[i] = s1.marks[i];
          }
     } 
}