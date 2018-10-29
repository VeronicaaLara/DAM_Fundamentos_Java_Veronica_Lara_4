package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// indicar si un numero si es positivo o negativo

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");

        int numero = sc.nextInt();
        int num = 0;

        if (num >=0){
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es negativo");
        }

        sc.close();
    }
}
