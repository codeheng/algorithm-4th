//P34-->1.1.14
//编写一个静态方法lg(),接受一个整型的参数N，返回不大于log2(N) 的最大整数，不要利用Math库

import edu.princeton.cs.algs4.StdOut;

public class method {
    private static int lg(int n){
        int shiftRightCount = 0;
        while(n != 0 ){
            n >>= 1;//借助右移 ==> 原数除以2
            shiftRightCount++;
        }
        return  shiftRightCount - 1;
    }
    public static void main(String[] args) {
        int value = 1025;
        int result = lg(value);
        System.out.printf("the result of method log is : %s\r\n",result);

    }
}
