/*
 * @Author: ehcgnahc 
 * @Date: 2025-11-04 09:39:34 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-11-04 10:07:35
 */
package HW2;

import java.util.*;

public class Main {
    public static int factorial(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        
        return n*factorial(n-1);
    }
    // static int[] memo = new int[10000];
    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        // if(memo[n] != 0) return memo[n];

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x, n;
            System.out.print("(1: n階乘、2: 第n項fibonacci number)\n請選擇一項運算功能: ");
            x = scanner.nextInt();
            
            if(x < 1 || x > 2){
                System.out.println("===== 輸入錯誤，請重新輸入 =====");
                continue;
            }
            
            System.out.print("請輸入n = ");
            n = scanner.nextInt();

            if(n < 0){
                System.out.println("===== n不可小於0，請重新操作 =====");
                continue;
            }

            if(x == 1) System.out.println(n + "! = " + factorial(n));
            else System.out.println("fibonacci 第" + n + "項 = " + fibonacci(n));

            break;
        }
        scanner.close();
    }
}
