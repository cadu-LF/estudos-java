/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.caelum.acesso.de.variaveis;

/**
 *
 * @author Cadu
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro a = new Carro();
        a.modelo = "Palio";
        a.setModelo("Palio 2");
        System.out.println(a.imprimeDados());
        System.out.println(a.ano);
        System.out.println(a.modelo.length()); /**
         * podemos fazer uma chamada concatenada de métodos para um mesmo objeto
         * por exemplo nesse caso, nós pegamos o atributo "modelo" dentro do 
         * objeto que a variável "a" referencia e pedimos o tamanho da String
         */
    }
}
