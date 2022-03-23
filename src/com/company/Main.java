
//Faça um Programa que converta metros para centímetros.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o metro que deseja Converter: ");
        double metros = scanner.nextDouble();

        double converter = metros / 100;
        System.out.println("O valor em centimetros é : "+ converter );

    }
}
