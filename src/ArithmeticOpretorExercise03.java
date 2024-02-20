public class ArithmeticOpretorExercise03{
	
	public static void main(String[] args){
	
	int i = 1;
	
	i = i++;	//(1)temp = i --> i值为1，(2)i = i + 1 --> i值为2，(3)i = temp --> i值为1 
	//jvm在处理 i = i++ 时，会建⽴⼀个临时变量来接收 i++ 的值（实际接收i的值），然后返回这个临时变量的值，返回的值再被等号左边的变量接收
	//i-- 同理
	
	System.out.println(i); 	//输出为 1
	
	i = ++i;	//(2)temp = i--> i值为2，(1)i = i + 1 --> i值为2，(3)i = temp --> i值为2
	//jvm在处理 i = ++i 时，会建⽴⼀个临时变量来接收 ++i 的值（实际接收i+1的值），然后返回这个临时变量的值，返回的值再被等号左边的变量接收
	//--i 同理
	
	System.out.println(i);	//输出为 2 
	
	
	}
}