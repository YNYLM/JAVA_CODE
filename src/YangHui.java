public class YangHui {
    public static void main(String[] args) {
        /*  打印输出指定行数的杨辉三角，
            1
            1   1
            1   2   1
            1   3   3   1
            1   4   6   4   1
            1   5   10  10  5   1
            ......
            (1) 每行的首列和最后一列值均为1，ary[n][0]与ary[n][m-1]的值均为1
            (2) 从第三行开始第二列至倒数第二列的各值为，上一行同列的元素值与上一行同列的前一列的元素值之和，
                ary[n][m]=ary[n-1][m]+ary[n-1][m-1]
            (3) 第一行输出1个值，第二行输出2个值，...第n行输出n个值
        * */
        int[][] ary = new int[10][];
        for(int i = 0; i < ary.length; i++){
            ary[1][1] = 1;
            for(int j = 0; j < i; j++){
                ary[i][j] = 1;
                System.out.print("数组的值为" + ary[i][j] + "\t");
            }
            System.out.println(" ");
        }
        for(int i = 2; i < ary.length; i++){
            for(int j = 0; j <= 10; j++){
                if(j>0){
                    ary[i][j]=1;
                }
            }
        }
    }
}
