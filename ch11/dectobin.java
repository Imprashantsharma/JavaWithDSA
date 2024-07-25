public class dectobin{
    public static void DecToBin(int DecNum){
        int num = DecNum;
        int pow = 0;
        int BinNum = 0;
        while(DecNum > 0){
            int LastDigit = DecNum % 2;
            BinNum = BinNum + LastDigit * (int)Math.pow(10,pow);
            pow++;
            DecNum = DecNum/2;
        }
     System.out.print("The binary no of "+ num + " is "+ BinNum);
    }   
    public static void main(String args[]){
         DecToBin(12);
    }
}