import java.util.Scanner;

public class ArithmeticOpretorExercise04 {
    public static void main(String[] args){
        System.out.println("Hello ArithmeticOpretorExercise04!");
        System.out.println(-10.4%3);
        Scanner myscanner=new Scanner(System.in);
        int age=myscanner.nextInt();
        if(age>18){
            System.out.println("大于十八");
        }
        else{
            System.out.println("不大于十八");
        }
    }
}
