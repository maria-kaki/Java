package org.example.domain;
public class Impressora {
    public void array(){
        int[] numeros = new int[5];
        String[] nomes = {"João", "Maria","Pedro"};
        double[] precos = new double[]{1.99,2.99,3.99};
    }
    public void imprimir(String texto){
        System.out.println("Texto: " + texto);
    }
    public void imprimir(int numero){
        System.out.println("Numero: " + numero);
    }
}