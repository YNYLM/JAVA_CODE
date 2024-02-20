/*路口缴费问题*/
/*某人有100,000元,每经过一次路口,需要交费,规则如下:
1)当现金>50000时,每次交5%
2)当现金 <= 50000时,每次交1000
编程计算该人可以经过多少次路口*/
import java.util.Scanner;
public class IntersectionTest {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.print("请输入你的现金额：");
        double manMoney=myScanner.nextDouble();//接收现金额
        double money=manMoney;//存入现金额
        int intersection=0;//定义路口数
        while (true) {
            if(money>50000){
                money*=0.95;//当现金额满足条件1）时执行
            }
            else if(money>=1000){
                money-=1000;//当现金额满足条件2）时执行
            }else{
                break;//当现金不足以缴费时执行
                }
            intersection++;//缴费后路口数自增
        }
        System.out.println("共计经过路口数为：" + intersection + " 共计花费：" + (int)(manMoney-money) + "元");//输出所通过的路口数
    }
}
