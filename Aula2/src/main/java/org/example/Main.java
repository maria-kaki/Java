package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o valor de PCC&F: ");
        double pccf = scanner.nextDouble();
        System.out.println("Escreva o valor de GS: ");
        double gs = scanner.nextDouble();
        double ms1 = (pccf * 0.4) + (gs * 0.6);
        System.out.println("O valor de MS1 é: " + ms1);
        scanner.close();
    }
}