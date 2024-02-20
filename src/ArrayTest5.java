/*
 moon_tree
* */

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*
          对数组元素进行缩减，当数组元素仅剩一个时，提示无法继续缩减
        * */
        Scanner myScanner = new Scanner(System.in);
        int[] ary = {1, 2, 3, 4, 5, 6, 7};
        System.out.println( "数组初始元素为：" );
        for ( int i = 0, count = 0; i < ary.length; i++) {
            if (count <= 3) {
                System.out.print(ary[i] + "\t");
                count ++;
            }else{
                System.out.println( ary[i] );
                count=0;
            }
        }
        System.out.println(" ");
        do {
            int[] aryNew = new int[ ary.length - 1 ];
            System.arraycopy(ary, 0, aryNew, 0, ary.length-1);
            ary = aryNew;
            System.out.println( "===缩减后的数组为===" );
            for (int i = 0, count = 0; i <= ary.length - 1; i++){
                if(count <= 3){
                    System.out.print( ary[i] + "\t");
                    count ++;
                }else{
                    System.out.println( ary[i] );
                    count = 0;
                }
            }
            System.out.println(" ");
            if(ary.length == 1){
                System.out.println( "数组元素数量为 1，无法继续缩减。" );
                break;
            }
            System.out.println( "是否继续缩减数组，请输入y/n：" );
            char key = myScanner.next().charAt( 0 );
            if(key == 'n'){
                break;
            }
        }while(true);
    }
}
