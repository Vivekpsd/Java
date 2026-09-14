package Array;

import java.util.Arrays;

public class Basics {
    // implement single/multi-dimensional array, print them
    // assign 2d array with random values
    // implement enhanced for loop
    public static void main(String[] args) {
        // single dimensional array
        
        // with fixed size
        int[] arr = new int[5];

        // with variable size
        // int[] arr = new int[]; // ERROR - won't compile - java needs to know how much memory to assign

        // change array size?
        int[] arr2 = new int[5];
        arr2 = new int[10]; // this creates a NEW array, doesn't resize the old one

        // fill array with default value
        Arrays.fill(arr2, 2);

        // fill some array elements with default value
        Arrays.fill(arr2, 2, 7, 4); // fills indices 2 to 6 (start inclusive, end exclusive) with value 2

        // print array
        for (int n: arr) {
            System.out.print(n);
        }
        System.out.println();

        for (int n: arr2) {
            System.out.print(n);
        }
        System.out.println();

        int[][] arr2d = new int[5][5];

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                arr2d[i][j] = (int)(Math.random()*10);
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/*
00000
2244444222
1 2 4 6 1 
1 8 0 1 9 
8 6 5 8 0 
1 8 4 1 5 
8 7 5 3 7 
 */