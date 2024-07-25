public class bubble{
    public static void bubble_sort(int number[]){
        int temp = 0;

        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i]> number[j]){
                    temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        System.out.print(number[i]+" ");
        }
    }


    // tutors  code
    public static void bubbleSort(int number[]){
        for(int turn = 0; turn<number.length-1; turn++){
            for(int j=0; j<number.length-1-turn; j++){
                int temp =0;
                if(number[j]>number[j+1]){
                 temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }
      
      public static void printarray(int number[]){
          for(int i=0;i<number.length; i++){
            System.out.print(number[i]);
        }
      }

    public static void main(String args[]){
        int number[] = { 5,4,1,3,2,8,9};
       // bubble_sort(number);
         bubbleSort(number);
          printarray(number);
    }
}