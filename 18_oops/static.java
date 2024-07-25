public class Static{
    public static void main(String args[]){
       Student s1 = new Student();
       s1.SchoolName = "CBG";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);
    }
}

class Student{

    String name;
    int roll;

    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }

    static String SchoolName;

    void setname(String name){
        this.name = name;
    }

     String getname(String name){
        return this.name;
    }
}