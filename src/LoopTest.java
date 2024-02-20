import java.util.Scanner;
public class LoopTest {
    public static void main(String[] args) {
        //打印任意行数直角三角形
        Scanner myScanner=new Scanner(System.in);
        //通过输入指定行数
        int rows=myScanner.nextInt();
        //（1）打印靠左直角三角形
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("");

        //（2）打印垂直翻转后的（1）
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("");

        //（3）打印水平翻转后的（2）
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int k=rows; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("");

        //(4)打印垂直翻转后的（3）
        for (int i=1; i<=rows; i++) {
            for (int j=rows; j>=i+1; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("");

        //(5)打印等腰三角形
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("");

        //(6)打印翻转后的（5）
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("");

        /*
             *
            ***
           *****
          *******
        */

        //(7)打印镂空金字塔
        for(int i=1;i<=rows;i++){
            //打印输出金字塔前空格
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
                //打印星号和空格
                for(int k=1;k<=2*i-1;k++){
                    //判断打印位置是否为第一位或者最后一位或者最后一层
                    if(k==1 || k==2*i-1 || i==rows){
                        System.out.print("*");//打印星号
                    }else{
                        System.out.print(" ");//打印空格
                    }
                }
            System.out.println("");
        }
        System.out.println("");

        //(8)打印空心菱形
        for(int i=1;i<=rows;i++){//打印上半
            //打印输出金字塔前空格
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //打印星号和空格
            for(int k=1;k<=2*i-1;k++){
                //判断打印位置是否为第一位或者最后一位或者最后一层
                if(k==1 || k==2*i-1){
                    System.out.print("*");//打印星号
                }else{
                    System.out.print(" ");//打印空格
                }
            }
            System.out.println("");
        }
        for(int i=rows-1;i>=1;i--){//打印下半
            //打印输出金字塔前空格
            for(int j=rows-1;j>=i;j--){
                System.out.print(" ");
            }
            //打印星号和空格
            for(int k=1;k<=2*i-1;k++){
                //判断打印位置是否为第一位或者最后一位或者最后一层
                if(k==1 || k==2*i-1){
                    System.out.print("*");//打印星号
                }else{
                    System.out.print(" ");//打印空格
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
}
