public class revision{

    // for printing the array

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // for recursion

   public static void quickSort(int arr[], int si, int ei){

       //base Case
       if(si >= ei){
           return;
       }

       int pIdx = partician(arr,si,ei);
       quickSort(arr,si,pIdx-1);
       quickSort(arr,pIdx+1,ei);

   }
   public static int partician(int arr[],int si, int ei){
       int pivot = ei;
       int i=si-1;

       for(int j=si; j<arr.length; j++){
           if(arr[j] < pivot){
               i++;
               //swap
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
           }

       }

       i++;
       //swap
       int temp = pivot;
       arr[ei] = arr[i];
       arr[i] = temp;

       return i;
   }


    public static void main(String args[]){
        int arr[] = {5,4,9,2,1,3};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}