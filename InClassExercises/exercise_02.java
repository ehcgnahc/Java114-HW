/*
 * @Author: ehcgnahc 
 * @Date: 2025-09-23 15:23:44 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-14 17:01:38
 * 
 * 課堂練習：學生成績等級判斷
 * 
 * 輸入一個學生的分數，
 * 若分數90分以上，則級別為A；
 * 若分數80以上但未滿90，則級別為B；
 * 若分數70以上但未滿80，則級別為C；
 * 若分數60以上但未滿70，則級別為D；
 * 若分數未滿60，則級別為F
 * （請使用巢狀 if 指令判斷）
 */

import java.util.Scanner;

public class exercise_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score");
        int score = scanner.nextInt();

        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

        scanner.close();
    }
}
