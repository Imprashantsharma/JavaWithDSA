import java.util.*;

public class binarytodec {
    public static void BintoDec(int BinNum){
        int num = BinNum;
        int pow =0;
        int DecNum = 0 ;
        while(BinNum > 0){
            int LastDigit = BinNum % 10;
            DecNum = DecNum + ( LastDigit * (int)Math.pow(2,pow));
            pow++;
            BinNum = BinNum/10;
            
        }
        System.out.println("the decimal of "+ num +" is = " + DecNum);
    }
    public static void main(String args[]){
         BintoDec(101);
    }
}