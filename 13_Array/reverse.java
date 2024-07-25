public class reverse{
    public static void pair_in_array(int number[]){
        for(int i=0; i<number.length; i++){
              int curnt = number[i];
              for(int j=i+1; j<number.length; j++){
                  System.out.print("(" + curnt + "," + number[j] + ")");
              }
              System.out.println();
        }
    }


    public static void reverse(int number[]){
        int first=0;
        int last=number.length-1;
        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,9};
       /* reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();*/
        pair_in_array(number);
    }
}