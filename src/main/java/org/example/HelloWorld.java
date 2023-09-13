package org.example;

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits in row: ");
        int row = Integer.valueOf(sc.next());
        System.out.println("Enter the number of digits in col: ");
        int col = Integer.valueOf(sc.next());
        for (int i = 0; i <= col; i++) {
            for(int j = 0; j <= row; j++) {
                if ((j % 2) == 0) {
                    System.out.print("B");
                } else {
                    System.out.print("W");
                }
            }
            System.out.println();
        }
    }
}
