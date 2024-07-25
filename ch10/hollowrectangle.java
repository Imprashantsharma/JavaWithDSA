public class hollowrectangle{
    public static void hollow_rectangle(int RowNum,int ColNum){
        for(int i = 1;i<=RowNum;i++){
            for(int j=1;j<=ColNum;j++){
                if(i==1 || i == RowNum || j == 1 || j == ColNum){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
         hollow_rectangle(4,5);
    }
}