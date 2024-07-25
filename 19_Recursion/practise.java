


    public static void AllOccurance(int arr[], int key,int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
      AllOccurance(arr,key,i+1);
    }
    public static void main(String args[]){
    /*    int arr[] = {3,4,2,5,6,2,7,2,2};
        int key = 2;
       AllOccurance(arr, key, 0);*/

       int num = 1902;
       String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
       NoToString(num, arr, 0);
     
    }
}