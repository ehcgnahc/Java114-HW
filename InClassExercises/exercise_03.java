/*
 * @Author: ehcgnahc 
 * @Date: 2025-09-30 14:24:48 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-14 17:04:52
 * 
 * 課堂練習：等比級數求和
 * 
 * 等比數列: a, a*b, a*b^2, a*b^3, a*b^4, …, a*b^(n-1)
 * 首項: a
 * 公比: b
 * 項數: n
 *
 * 輸入 a, b, 及 n
 * 以 for 迴圈計算等比級數：
 * S = a + a*b + a*b^2 + a*b^3 + … + a*b^(n-1)
 */
package InClassExercises;

import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter n");
        int n = scanner.nextInt();

        int total = 0;

        for(int i=0;i<n;i++){
            total += a;
            a *= b;
        }
        System.out.println(total);

        scanner.close();
    }
}
