//编写一个静态方法histogram(),接受一个整型数组a[]和一个整数M为参数并返回一个为M的数组
//其中第i个元素的值为整数i在参数数组中出现的次数
//如果a[]中的值均在0到M-1之间，返回数组所有元素之和应该和a.length相等

public class method_1_1_15 {
    public static int[] histogram(int[] a,int M){
        int[] result = new int[M];

        for (int i = 0;i < a.length;i++){
            if( a[i] > 0 && a[i] < M){
                result[a[i]]++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,3,1,7,5,3,2,2,2};
        int[] result = histogram(a,8);
        for(int i = 0;i < result.length;i++){
            System.out.printf("%3d",result[i]);
        }
    }
}
