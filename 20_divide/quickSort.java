public class quickSort{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei){
        
        //base case
        if(si >= ei){
            return;
        }

        int pIdx = partician(arr,si,ei);
        QuickSort(arr,si,pIdx-1);
        QuickSort(arr,pIdx+1,ei);

    }

    public static int partician(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
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
        int arr[] = {6,3,9,8,2,5};
        QuickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}