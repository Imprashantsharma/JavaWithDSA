public class sort{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
    
    //base  case
        if(si >= ei){
            return;
        }

        int mid = si+(ei - si)/2;

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid ,int ei){
      int temp[] = new int[ei-si+1];
      int i = si;      // idx for first part
      int j = mid+1;   //idx for second part
      int k = 0;       // idx for temp

      while(i <= mid && j <=ei){
          if( arr[i] < arr[j] ){
              temp[k] = arr[i];
              i++;
          }else{
              temp[k] = arr[j];
              j++;
          }
          k++;
      }

      // for leftover part in left side
      while(i <= mid){
          temp[k++] = arr[i++];
      }

      // for leftover part in right side
      while(j <= ei){
          temp[k++] = arr[j++];
      }

      // copy temp[] to arr[]
      for(k=0,i=si; k<temp.length; k++,i++){
          arr[i] = temp[k];
      }
    }


    public static void main(String args[]){
        int arr[] = {5,3,7,8,5,6};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}