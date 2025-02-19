package org.example;
import java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o valor da Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Escreva o valor da Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Escreva o valor do Trabalho: ");
        double trabalho = scanner.nextDouble();
        double MS = (nota1*0.4) + (nota2*0.4) + (trabalho*0.2);
        if(MS >=7){
           System.out.print("Aluno aprovado!");
        }
        else {
            System.out.println("Escreva o valor do Exame: ");
            double NE = scanner.nextDouble();
            double ME = (MS+NE)/2;
            if(ME>=5){
                System.out.println("Aluno aprovado!");
            }
            else{
                System.out.println("Aluno reprovado!");
            }
        }
        scanner.close();
    }
}
