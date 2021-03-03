package com.br.caelum.metodos;

/**
 *
 * @author Cadu Lourenço
 */
public class Pessoa {
    String nome;
    int idade;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void imprime(){
        System.out.println(getNome());// posso chamar um método dentro de outro método
    }
    
}
