public class ArrayTest1 {
    public static void main(String[] args) {
        //给定一个数组，找出其中的最大值和最小值，以及最大值和最小值所对应的下标
        int[] array1 = new int[]{-3,2,17,4,6,-4};
        int max = array1[0],maxIndex = 0,min = array1[0],minIndex=0;
        for ( int i = 1; i < array1.length ; i++ ){
            if ( max < array1[i] ){//判断当前数是否大于预定最大值，若大于则取当前数替换预定最大值
                max = array1[i];
                maxIndex = i;
            }
            if ( min > array1[i] ){//判断当前数是否小于预定最小值，若小于则取当前数替换预定最小值
                min = array1[i];
                minIndex = i;
            }
        }
        //打印输出最大值和最小值
        System.out.println("最大值为：" + max + "下标为：" + maxIndex);
        System.out.println("最小值为：" + min + "下标为：" + minIndex);
    }
}
