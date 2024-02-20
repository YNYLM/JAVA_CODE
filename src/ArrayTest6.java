/*
 moon_tree
* */
public class ArrayTest6 {
    public static void main(String[] args) {
        //对数组元素进行排序，使数组元素按从小到大的顺序排列(冒泡排序)
        int[] ary = { 1, 8, 3, 7, 5, 4, 2, 0};
        System.out.println("===初始数组元素顺序为===");
        for(int i = 0; i <= ary.length - 1; i++){
            System.out.print(ary[i] + "\t");
        }
        System.out.println(" ");

        for(int i = 0; i <= ary.length - 1; i++){   //对全部数组元素进行遍历
            for(int j = i + 1, temp = 0; j <= ary.length - i - 1; j++){    //对待比较数组元素进行遍历
                if(ary[i] > ary[j]){    //判断当前数组元素是否大于下一数组元素
                    temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }

        System.out.println("===数组元素从小到达排列为===");
        for(int i = 0; i <= ary.length - 1; i++){
            System.out.print(ary[i] + "\t");
        }
    }
}
