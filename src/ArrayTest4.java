import java.util.Scanner;
public class ArrayTest4 {
    public static void main(String[] args) {
        /*通过键盘输入一个数，将该数添加到原数组之后，完成数组的一次扩容，随即打印扩容后的结果，
        并在用户输入Y后继续进行扩容输入，在用户输入N后退出扩容程序
         */
        int[] ary = {1, 2, 3};  //建立初始数组并赋初值
        Scanner myScanner = new Scanner(System.in);
        System.out.println("===初始数组元素为===");
        for ( int i = 0,count = 0; i < ary.length; i++){   //打印输出初始数组的值
            if(count <= 3){ //格式控制
                System.out.print(ary[i] + "\t");
                count ++;
            }else{
                System.out.println(ary[i] + "\t");
                count = 0;
            }
        }
        System.out.println(" ");
        do {    //程序循环体至少执行一次
            System.out.print("请输入你需要添加的数：");
            int num = myScanner.nextInt();  //接收键盘输入的数
            int[] aryNew = new int[ary.length + 1]; //根据初始数组的长度确定扩容后数组的长度
            System.arraycopy(ary, 0, aryNew, 0, ary.length);   //将初始数组元素的值依次赋给新数组
            aryNew[aryNew.length - 1] = num;    //将由键盘接收到的值赋值给新数组最后一位
            ary = aryNew;   //将新数组所指向的内存地址赋值给初始数组，进行更新
            System.out.println("===扩容后的数组元素为===");
            for ( int i = 0,count=0; i <= ary.length - 1; i++){ //打印输出扩容后数组的值
                if(count <= 3){ //格式控制
                    System.out.print(ary[i] + "\t");
                    count++;
                }else{
                    System.out.println(ary[i] + "\t");
                    count=0;
                }
            }
            System.out.println(" ");
            System.out.println("是否继续添加（y/n）:");
            char key=myScanner.next().charAt(0);    //接收键盘键入的值判断是否继续循环添加
            if(key == 'n'){
                break;
            }
        } while(true);
    }
}
