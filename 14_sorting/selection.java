public class selection{
    public static void selection_Sort(int array[]){
        for(int i=0; i< array.length-1; i++){
            int MinPos = i;
            for(int j=i+1; j< array.length; j++){
                if( array[MinPos] > array[j]){
                    MinPos = j;
                }
            }
            //swap
            int temp=0;
            temp  = array[MinPos];
            array[MinPos] = array[i];
            array[i] = temp;
            
        }
    }

    public static void printarray(int array[]){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String args[]){
        int array[] = {5,4,1,2,3};
        selection_Sort(array);
        printarray(array);
    }
}