package com.company;

import java.util.Scanner;
/*Read two numbers.
       a) If both are even print “both even”. If both are odd print “both odd”. Otherwise print “one is odd and the other is even”.
       b) Print all the numbers between the two separated by comma
       c) Sum all the numbers between the two
       d) Find the maximum number between the two
       e) Can the first one be divided by the second? Print true/false*/

public class Main {

    public static void main(String[] args) {
       // punctA ();
       // punctB ();
        //punctC ();
       // punctD ();
        punctE ();
    }


    public static void punctA (){
        // punct a
        int N1;
        System.out.print("Dati numarul : ");
        N1 = new Scanner(System.in). nextInt();
        int N2;
        System.out.print("Dati numarul : ");
        N2 = new Scanner(System.in). nextInt();
        int rest1;
        int rest2;
        rest1=N1%2;
        rest2=N2%2;
        if(rest1==0 && rest2==0){
            System.out.println(" both even");
        }
        if(rest1==1 && rest2==1){
            System.out.println(" both odd");
        }
        else {
            System.out.println(" one is odd and other is even");
        }
        }

    public static void punctB (){
        // punct b
        int N1;
        System.out.print("Dati numarul 1 : ");
        N1 = new Scanner(System.in). nextInt();
        int N2;
        System.out.print("Dati numarul 2 : ");
        N2 = new Scanner(System.in). nextInt();
        int i;
        if (N1<N2) {
            for (i = N1+1; i < N2; i++) {
                System.out.print(i + ",");
            }
        }
        else { for ( i=N2+1; i< N1; i++ ) {
                System.out.print(i + ",");

            }
        }
    }

    public static void punctC () {
        // punct c
        int N1;
        System.out.print("Dati numarul 1 : ");
        N1 = new Scanner(System.in).nextInt();
        int N2;
        System.out.print("Dati numarul 2 : ");
        N2 = new Scanner(System.in).nextInt();
        int i;
        int sum = 0;

        if (N1 < N2) {
            for (i = N1 + 1; i < N2; i++) {
                sum = sum + i;


            }
            System.out.print("sum = " + sum);
        } else {
            for (i = N2 + 1; i < N1; i++) {
                sum = sum + i;

            }
            System.out.print("sum = " + sum);
        }

    }
    public static void punctD () {
        // punct D
        int N1;
        System.out.print("Dati numarul 1 : ");
        N1 = new Scanner(System.in).nextInt();
        int N2;
        System.out.print("Dati numarul 2 : ");
        N2 = new Scanner(System.in).nextInt();

        if (N1 < N2) {

                System.out.print("cel mai mare e: " + N2);

            }

         else { System.out.print("cel mai mare e: " + N1);

            }

        }

    public static void punctE () {
        // punct E
        int N1;
        System.out.print("Dati numarul 1 : ");
        N1 = new Scanner(System.in).nextInt();
        int N2;
        System.out.print("Dati numarul 2 : ");
        N2 = new Scanner(System.in).nextInt();
        int rest = N1%N2;
        if (rest==0) {

            System.out.print("thue" );

        }

        else { System.out.print("false " );

        }

    }
    }






        // write your code here


