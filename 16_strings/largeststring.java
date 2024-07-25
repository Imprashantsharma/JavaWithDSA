public class largeststring{
    public static void main(String args[]){
        String fruit[] = {"apple", "mango", "banana"};

        String largest ="";
        for(int i=0; i<fruit.length; i++){
            if(largest.compareTo(fruit[i]) < 0 ){
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}