public class Offer17 {
    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

    /**
     * 别忘了Math关于幂函数的运用
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int m = (int) Math.pow(10,n);
        int j = 1;
        int[] arrayResult = new int[m-1];
        for (int i = 0; i < m - 1; i++, j++) {
            arrayResult[i] = j;

        }
        return arrayResult;
    }
}
