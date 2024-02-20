public class ArrayTest3 {
    public static void main(String[] args) {
        //交换数组中1位和n位，2位和n-1位，... 的值
        int[] ary1 = {1,2,3,4,5,6,7,8,9,10};

        for ( int i = 0; i < ary1.length; i++){
            System.out.print( ary1[i] + " ");
        }

        System.out.println("");

        for( int i = 0,temp; i < ary1.length/2; i++){
            temp = ary1[i];
            ary1[i] = ary1[ary1.length-1-i];
            ary1[ary1.length-1-i] =temp;
        }

        for ( int i = 0; i < ary1.length; i++){
            System.out.print( ary1[i] + " ");
        }
    }
}
