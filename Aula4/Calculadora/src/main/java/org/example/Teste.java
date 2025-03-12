package org.example;

import org.example.domain.Calculadora;
import org.example.domain.Filho;
import org.example.domain.Pai;

public class Teste{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(2,3));
        System.out.println(calc.soma(2,3,4));
        System.out.println(calc.soma(2.5,3.5));

        Pai pa = new Pai();
        Filho ilho = new Filho();

        ilho.mensagem();
        pa.mensagem();

    }
}