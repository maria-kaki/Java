package org.example;

public class Main {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

Main pessoa1= new Pessoa();
Main pessoa2= new Pessoa("João",25);
