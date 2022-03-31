/**
 * @author      Uddam Bhathal <Uddamsingh14@gmail.com>
 * @version     1.2
 * @since       1
 */
package com.company;
public class Main {
    public static void main(String[] args) {
         //WithoutTen.java
        int[][] arr = {{1, 10, 10, 2}, {9, 3, 6, 7}, //initializing 2D array
                {11, 13, 8, 10}, {2, 10, 6, 12}};
        for (int i = 0; i < arr.length; i++) { //traversing through array to set every instance of 10 to 0
            for (int x = 0; x < arr[0].length; x++) {
                if (arr[i][x] == 10) {
                    arr[i][x] = 0;
                }
            }
        }
        int store = 0;
        for (int i = 0; i < arr.length; i++) { //checking each index for 0 and sliding the 0 to the last column
                                               //while moving other values one step to the left
            for (int x = 0; x < arr[0].length; x++) {
                if (arr[i][x] == 0) {
                    arr[i][x] = arr[i][arr[0].length-1];
                    arr[i][arr[0].length-1] = 0;
                    if(arr[i][arr[0].length-1]!=arr[i][arr[0].length-2]){
                        store = arr[i][arr[0].length-3];
                        arr[i][arr[0].length-3]=arr[i][arr[0].length-2];
                        arr[i][arr[0].length-2] = store;
                    }
                }
                System.out.print(arr[i][x]); //printing optimized array
            }
            System.out.println();
        }
    }
}
