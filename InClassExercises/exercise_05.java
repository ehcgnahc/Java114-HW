/*
 * @Author: ehcgnahc 
 * @Date: 2025-10-14 16:31:43 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-10-14 17:06:22
 * 
 * 課堂練習：矩陣轉置
 * 
 * 將矩陣 A 轉置為另一個矩陣 B，並將 B 印出
 */
package InClassExercises;

public class exercise_05 {
    public static void main(String[] args){
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = a.length;
        int m = a[0].length;
        int[][] b = new int[m][n];
        for(int i=0;i<n;i++){
            for(int f=0;f<m;f++){
                b[f][i] = a[i][f];
            }
        }

        for(int i=0;i<m;i++){
            for(int f=0;f<n;f++){
                System.out.print(b[i][f] + " ");
            }
            System.out.println();
        }
    }
}
