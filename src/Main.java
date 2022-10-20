import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int i;
        int j;
        int u;
        int k;
        int f;
        int w;


        //Array 1

        System.out.println("Input row:");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        System.out.println("Input column:");
        int column = scan.nextInt();



        int[][] array = new int[row][column];

        for (i = 0; i < row; i++){
            for (j = 0; j < column ; j++){
                System.out.println("Input number:");
                array[i][j] = scan.nextInt();
            }

        }


        //Array 2

        System.out.println("Input row:");
        int row2 = scan.nextInt();

        System.out.println("Input column:");
        int column2 = scan.nextInt();



        int[][] array2 = new int[row][column];

        for (k = 0;k < row2; k++){
            for (f = 0; f < column2; f++){
                System.out.println("Input number:");
                array2[k][f] = scan.nextInt();
            }

        }


        //Adding Arrays

        int[][] totalArray = new int [row][column];

        if (row == row2 && column == column2){
            for (k = 0;k < row; k++){
                for (f = 0; f < column; f++){
                    int total = array[k][f] + array2 [k][f];
                    totalArray[k][f] = total;
                }
            }

            for (w = 0; w < totalArray.length; w++) {
                for (u = 0; u < totalArray.length; u++) {
                    System.out.print(totalArray[w][u] + " ");
                }
                System.out.println();
            }

        }else{
            System.out.println("Can't add, different sizes.");
        }




    }


}