package Array;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[5];
        arr[2] = new int[3];

        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}

/*
Output:
8 2 
5 3 7 8 6 
8 2 6 
*/