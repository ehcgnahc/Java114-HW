/*
 * @Author: ehcgnahc 
 * @Date: 2025-10-21 14:22:12 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-21 14:41:44
 * 
 * 課堂練習：組合計算
 * 
 * 寫兩個 methods：
 * 1. 計算 n!（階乘）
 * 2. 呼叫階乘方法計算 C(n, m) = n! / (m! * (n - m)!)
 */
package InClassExercises;

import java.util.Scanner;

public class exercise_06 {
    public static int factorial(int n){
        if(n == 1 || n == 0) return 1;
        else return n * factorial(n-1);
    }
    public static int C(int n, int m){
        return factorial(n) / (factorial(m) * factorial(n-m));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N and M");
        int n = scanner.nextInt(), m = scanner.nextInt();
        System.out.println("Factorial " + n + " = " + factorial(n));
        System.out.println("C(N, M) = " + C(n, m));
        scanner.close();
    }
}