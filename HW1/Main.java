/*
 * @Author: ehcgnahc 
 * @Date: 2025-10-01 16:25:21 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-01 17:34:54
 */
package HW1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        int[] cost = {15, 20, 25};
        String[] name = {"礦泉水", "奶茶", "可樂"};

        while(true){
            try{
                System.out.print("(1: 投幣、2: 退幣、3: 購買、4: 離開程式)\n請選擇一個操作選項: ");
                int choice = scanner.nextInt();
                
                if(choice < 1 || choice > 4){
                    System.out.println("===== 輸入錯誤，請重新輸入 =====");
                    continue;
                }
                
                if(choice == 1){
                    System.out.print("請輸入投幣金額: ");
                    int input = scanner.nextInt();
                    if(input <= 0){
                        System.out.println("===== 投幣金額必須大於0元，請重新操作 =====");
                        continue;
                    }
                    total += input;
                }else if(choice == 2){
                    System.out.println("已退幣成功");
                    total = 0;
                }else if(choice == 3){
                    System.out.print("(1: 礦泉水15元、2: 奶茶20元、3: 可樂25元)\n請輸入欲購買的飲料: ");
                    int drink = scanner.nextInt();
                    
                    if(drink < 1 || drink > 3){
                        System.out.println("===== 輸入錯誤，請重新操作 =====");
                        continue;
                    }
    
                    if(cost[drink-1] > total){
                        System.out.println("===== 金額不足，請重新操作 =====");
                    }else{
                        total -= cost[drink-1];
                        System.out.println("購買 " + name[drink-1] + " 成功，剩餘 " + total + " 元");
                    }
                }else if(choice == 4){
                    System.out.println("謝謝惠顧");
                    scanner.close();
                    break;
                }
            }catch(Exception e){
                System.out.println("===== 輸入錯誤，請重新操作 =====");
                scanner.nextLine();
            }
        }
    }
}