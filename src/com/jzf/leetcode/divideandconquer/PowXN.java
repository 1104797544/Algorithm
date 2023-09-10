package com.jzf.leetcode.divideandconquer;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/9 <br>
 * @see com.jzf.leetcode.divideandconquer <br>
 * @since V9.0 <br>
 */
public class PowXN {
    public static void main(String[] args) {
        PowXN powXN = new PowXN();
        powXN.myPow(2.0, 10);
    }
    /**
     * 分治思路: x^n 求解
     * n为偶数时,x^n = x ^（n/2) * x ^（n/2);
     * n为奇数时,x^n = x ^（n/2) * x ^（n/2) * x;
     */
    public double myPow(double x, int n) {
        // n为正数和负数,分开求解
        if (n >= 0) {
            return powN(x, n);
        }
        // n为负数时,求pow(x, -n)得倒数
        // 这里需要特殊处理,否则n = -2^32时,-n会溢出
        return 1 / ((powN(x, -(n + 1))) * x);
    }


    public double powN(double x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1.0;
        }
        double half = powN(x, n / 2);
        if (n % 2 == 1) {
            return half * half * x;
        }
        return half * half;
    }
}
