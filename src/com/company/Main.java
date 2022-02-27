package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	/* int[][]array=new int[5][5];
             Random random=new Random();
             for (int i=0; i<5;i++){
                for (int j=0;j<5;j++){
                        array[i][j]=random.nextInt(50);
                    }
                }
                for (int i=0;i<5;i++){
                    for (int j=0;j<5;j++){
                        System.out.print(array[i][j]+" ");
                    }
                    System.out.println();
              }

    }
}
	 */
/*пример 1*/
        /*
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int[][]array=new int[a][a];
        Random random=new Random();
        for (int i=0; i<a;i++){
            for (int j=0;j<a;j++){
                array[i][j]=random.nextInt(50);
            }}
        for (int i=0;i<a;i++) {
            for (int j = 0; j <a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int c=0;
        double d;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                d=array[i][j];
                if (i==j) {
                    if (d%2==0) {
                        c+=array[i][j];
                    }
                }
            }
        }
    System.out.println(c);}}
             */

        /*пример 2*/

/*
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int[][]array=new int[a][a];
        Random random=new Random();
        for (int i=0; i<a;i++){
            for (int j=0;j<a;j++){
                array[i][j]=random.nextInt(50);
            }}
        for (int i=0;i<a;i++) {
            for (int j = 0; j <a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
        int d;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                d=array[i][j];
                if (j<=i) {
                    if (d%2!=0) {
              System.out.print(d+" ");
                    }}}}
        }}
         */




        /*пример 3*/
/*
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int[][]array=new int[a][a];
        Random random=new Random();
        for (int i=0; i<a;i++){
            for (int j=0;j<a;j++){
                array[i][j]=random.nextInt(50);
            }}
        for (int i=0;i<a;i++) {
            for (int j = 0; j <a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int c=1;
        int d;

        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                d=array[i][j];
                if (i==j) {
                        c*=d;
                    }
                } System.out.print(c+" ");
            }
        System.out.println();
        int e=1;
        int f;
        for (int i=0, j=a-1;i<a;i++, j--){
                f=array[i][j];
                if (f>=0){
                    e=e*f;}System.out.print(e+" ");}
        System.out.println();
        if (c>e){System.out.println("произведение элементов главной диагонали больше");}
        else {
            if (e > c) {
                System.out.println("произведение элементов побочной диагонали больше");
            } else {
                System.out.println("произведения элементов диагоналей равны");
            }
        }}}
         */


        /*пример 4*/

/*
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int[][]array=new int[a][a];
        Random random=new Random();
        for (int i=0; i<a;i++){
            for (int j=0;j<a;j++){
                array[i][j]=random.nextInt(50);
            }}
        for (int i=0;i<a;i++) {
            for (int j = 0; j <a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("----------");
        int d;
        int e=0;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                d=array[i][j];
                if (i<j) {
                    if (d%2==0) {
                        e += d;
                        System.out.print(d + " ");
                    }}}}
        System.out.println();
                 System.out.println(e);
        }}
         */

        /*пример 5*/

        /*

        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int[][]array=new int[a][a];
        Random random=new Random();
        for (int i=0; i<a;i++){
            for (int j=0;j<a;j++){
                array[i][j]=random.nextInt(50);
            }}
        for (int i=0;i<a;i++) {
            for (int j = 0; j <a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");


            int [][] second=new int[a][a];
        for (int i=0;i< second.length;i++) {
            for (int j = 0; j < second.length; j++) {
second[i][j]=array[j][i];
            System.out.print(second[i][j]+" ");}
        System.out.println();}}}
         */