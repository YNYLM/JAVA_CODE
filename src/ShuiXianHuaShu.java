/*输入一个整数num1，打印1至num1的水仙花数，并统计水仙花数的个数*/

import java.util.Scanner;
public class ShuiXianHuaShu {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num1=myScanner.nextInt(),count=0;
        System.out.println("1至" + num1 + "的水仙花数包括：");
        for(int i=1,x,y,sum,cnt;i<=num1;i++){
            //每轮判断开始前进行x,y,cnt,sum参数的初始化
            x=i;
            y=i;
            cnt=0;
            sum=0;
            while(x!=0){//统计预判断数字的位数
                x=x/10;
                cnt++;
            }
            for(int j=1;j<=cnt;j++){//统计预判断数字每一位数的次方之和
                sum+=(int)Math.pow((y%10),cnt);
                y/=10;
            }
            if(i==sum && i>=100){//判断该数字是否与其每一位数的次方之和相等
                System.out.print(i + "  ");
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("总计" + count + "个");
    }
}
