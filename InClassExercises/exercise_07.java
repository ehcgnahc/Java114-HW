/*
 * @Author: ehcgnahc 
 * @Date: 2025-10-21 14:42:14 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-21 15:04:10
 * 
 * 課堂練習：調和級數
 * 
 * 計算調和級數到第 n 項：
 * Hn = 1 + 1/2 + 1/3 + ... + 1/n
 */

import java.util.Scanner;

public class exercise_07 {
    public static double Harmonic_Series(int n){
        if(n == 1) return 1;
        else return (1.0 / n) + Harmonic_Series(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Harmonic_Series(n) = " + Harmonic_Series(n));
        scanner.close();
    }
}