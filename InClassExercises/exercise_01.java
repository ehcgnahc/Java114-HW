/*
 * @Author: ehcgnahc 
 * @Date: 2025-09-18 18:23:40 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-21 14:41:37
 * 
 * 課堂練習：一元二次方程式
 * 
 * 求一元二次方程式 ax² + bx + c = 0 的根
 */
package InClassExercises;

import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();

        double d = b*b-4*a*c;

        if(d<0){
            System.out.println("無解");
        }else{
            d = Math.sqrt(d);
            System.out.println(d);
            System.out.println("x1 = "+((-b+d)/(2*a)));
            System.out.println("x2 = "+((-b-d)/(2*a)));
        }

        scanner.close();
    }
}
