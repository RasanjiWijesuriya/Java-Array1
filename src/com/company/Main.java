package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Array[][]=new int [3][3];
        Array[0][0]=2;
        Array[0][1]=9;
        Array[0][2]=4;
        Array[1][0]=7;
        Array[1][1]=5;
        Array[1][2]=3;
        Array[2][0]=6;
        Array[2][1]=1;
        Array[2][2]=8;

        //print columns
        for (int j = 0; j < 3; j++){
            System.out.print("\tCol"+(j+1));
        }

        //find row total and print...
        System.out.print("\tTotal");
        //diagonal-2 tot
        int Total=Array[2][0]+Array[1][1]+Array[0][2];
        System.out.print("\t"+Total+"-diagonal_2_total");
        int row_tot[]=new int [3];
        for (int i = 0; i < 3; i++){
            int total=0;
            for (int j = 0; j <3 ; j++){
                total+=Array[i][j];
            }
            row_tot[i]=total;
        }
        //print rows, sum of rows(total of values) and values.....
        for (int i = 0; i < 3; i++){
            System.out.print("\n\n");
            System.out.print("row"+(i+1));
            System.out.print("\t");
            for (int j = 0; j < 3; j++){
                System.out.print(Array[i][j]+"\t");
            }
            System.out.print(row_tot[i]+"\t");

        }

        //print column total
        System.out.print("\n\n");
        System.out.print("Tot-col");

        int col_tot[]=new int[3];
        for (int j = 0; j <3 ; j++){
            int total=0;
            for (int i = 0; i < 3; i++){
                total+=Array[i][j];
            }
            col_tot[j]=total;
            System.out.print("\t"+col_tot[j]);
        }
        //diagonal-1 tot
        int tot=Array[0][0]+Array[1][1]+Array[2][2];
        System.out.print("\t"+tot+"-diagonal_1_tot");


        System.out.println();

    }
}
