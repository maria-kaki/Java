package org.example.domain;

public class Calculadora {

    public int soma(int a, int b) {
        return a+b;
    }

    public int soma(int a, int b, int c){
        return a+b+c;
    }

    public double soma(double a, double b){
        return a+b;
    }

    public int soma(int[] precos){
        int resultado = 0;
        for (int i = 0; i < precos.length; i++){
            resultado += precos[i];
        }
        return resultado;
    }

    public int subtracao(int a, int b) {
        return a-b;
    }

    public int subtracao(int a, int b, int c){
        return a-b-c;
    }

    public double subtracao(double a, double b){
        return a-b;
    }

    public int subtracao(int[] precos){
        int resultado = 0;
        for (int i = 0; i < precos.length; i++){
            resultado -= precos[i];
        }
        return resultado;
    }

    public int multiplicacao(int a, int b) {
        return a*b;
    }

    public int multiplicacao(int a, int b, int c){
        return a*b*c;
    }

    public double multiplicacao(double a, double b){
        return a*b;
    }

    public int multiplicacao(int[] precos){
        int resultado = 1;
        for (int i = 0; i < precos.length; i++){
            resultado *= precos[i];
        }
        return resultado;
    }

    public int divisao(int a, int b) {
        if (b == 0){
            System.out.println("O denominador não pode ser 0");
            return 0;
        }
        return a/b;
    }

    public double divisao(int a, int b, int c){
        if (b == 0 || c ==0) {
            System.out.println("O denominador não pode ser 0");
            return 0;
        }
        return (a/b)/c;
    }

    public double divisao(double a, double b){
        if (b == 0){
            System.out.println("O denominador não pode ser 0");
            return 0;
        }
        return a/b;
    }

    public int divisao(int[] precos){
        int resultado = precos[0];
        for (int i = 1; i < precos.length; i++){
            if (precos[i]==0){
                System.out.println("preco: " + precos[i] + "é 0.");
                continue;
            }
            resultado /= precos[i];
        }
        return resultado;
    }

}