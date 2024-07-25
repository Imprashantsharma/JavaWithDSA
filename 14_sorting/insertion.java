public class insertion{
    public static void insertion_Sort(int array[]){
        for(int i=1; i<array.length; i++){
            int temp = array[i];
            int j=i-1;
            while(j>=0 && array[j]> temp){
                  array[j+1] = array[j];
                  j--;
            }
            array[j+1] = temp;
        }
        
    //  System.out.print(array);
    }

    public static void printarray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String args[]){
        int array[] = {8,4,1,5,9,2};
        insertion_Sort(array);
        printarray(array);
    }
}