public class ArrayTest2 {
    public static void main(String[] args) {
        /* 将一个数组赋值给另一个数组，本质为将该数组的地址赋给另一个数组
          当原数组的值发生改变时，被赋值数组的值也会随之改变 */
        int[] myArray1 = {1,2,3};
        int[] myArray2 = new int[3];
        myArray2 = myArray1;
        for ( int i = 0,x ; i < myArray2.length ; i++){
            x = myArray2[i];
            System.out.println( x );
        }
        for ( int i = 0 ; i < myArray2.length ; i++){
            myArray1[i] += 1;
            System.out.println( myArray2[i] );
        }
    }
}
