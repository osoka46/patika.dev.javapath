package java101.mayinTarlasi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    int amount;
    int[][] map;  //mayinli dizi
    int[][] board; //kullaniciya gosterilecek dizi
    boolean check = true;

    Random rand = new Random();
    Scanner obje = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.amount = rowNumber * colNumber;
    }

    void run() {
        int row,col;
        printArr(this.board);

        prepareGame();



        while (check) {
            System.out.print("satir numarasi:");
            row = obje.nextInt();

            System.out.print("sutun numarasi:");
            col = obje.nextInt();

           if ((row>this.rowNumber-1||row<0)&&(col>this.colNumber-1||col<0))
            {
                System.out.println("belirlenen aralikta giris yapiniz.");
                System.out.println("0 dahil, 0 ile "+this.rowNumber+" arasi");
                continue;
            }

            if (this.map[row][col] != -1) {

                checkMayin(row,col);


            }
            if (this.map[row][col] == -1) {
                System.out.println("kaybettiniz. Mayinli arazi");
                printArr(this.map);
                check = false;

            }


        }
    }

    public void checkMayin(int row, int col) {
        int count = 0;

        if (row==0)
        {
            if (this.map[row+1][col]==-1)
            {
                count++;
            }
        }
        if (row==this.rowNumber-1)
        {
            if (this.map[row-1][col]==-1)
            {
                count++;
            }
        }
        if (row>0&&row<=this.rowNumber-1)
        {
            if (this.map[row+1][col]==-1)
            {
                count++;
            }
            if (this.map[row-1][col]==-1)
            {
                count++;
            }
        }

        if (col==this.colNumber-1)
        {
            if (this.map[row][col-1]==-1)
            {
                count++;
            }
        }
        if (col>0&&col<this.colNumber-1)
        {
            if (this.map[row][col-1]==-1)
            {
                count++;
            }
            if (this.map[row][col+1]==-1)
            {
                count++;
            }
        }
        if (col==0)
        {
            if (this.map[row][col+1]==-1)
            {
                count++;
            }
        }


   /*     if ((row<this.rowNumber)&&(map[row-1][col]==-1))
        {
            count++;
        }
        if ((row>this.rowNumber)&&map[row+1][col]==-1)
        {
            count++;
        }
        if ((col<this.colNumber)&&map[row][col-1]==-1)
        {
            count++;
        }
        if((col>this.colNumber)&&map[row][col+1]==-1)
        {
            count++;
        }
*/
        this.board[row][col] = count;
        printArr(this.board);

    }

    void prepareGame() {

        int randRow, randCol, count = 0;
        while (count != amount / 4) {
            randRow = rand.nextInt(this.rowNumber);
            randCol = rand.nextInt(this.colNumber);
            if (this.map[randRow][randCol] != -1) {
                this.map[randRow][randCol] = -1;
                count++;
            }

        }

    }


    public void printArr(int[][] arr) {

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {

                if (arr[x][y] >= 0) {
                        System.out.print(" ");
                }
                System.out.print(arr[x][y]+" ");

            }
            System.out.println();
        }
    }


}
