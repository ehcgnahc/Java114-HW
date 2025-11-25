/*
 * @Author: ehcgnahc 
 * @Date: 2025-09-30 15:26:00 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-14 17:05:14
 * 
 * 課堂練習：N個學生、K門課的平均成績
 * 
 * 輸入 N（學生數）與 K（科目數）
 * 再依序輸入每位學生在各科的成績
 * 計算並輸出每一位學生的平均分數
 */

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N");
        int N = scanner.nextInt();
        System.out.println("Enter K");
        int K = scanner.nextInt();
        
        int total = 0;
        for(int i=0;i<N;i++){
            for(int f=0;f<K;f++){
                System.out.println("輸入第" + (i+1) + "個學生的第" + (f+1) + "科成績");
                int score = scanner.nextInt();
                total += score;
            }
            System.out.println("第" + (i+1) + "個學生的總平均為" + (total/K));
        }

        scanner.close();
    }
}
