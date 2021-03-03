package com.br.caelum.metodos;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaPessoa{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Cadu", 19);
        System.out.println(p1.getNome());
        p1.imprime();
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Geraldo", 85);
        System.out.println(p2.getNome());
        p2.imprime();
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Gerald", 1000);
        System.out.println(p3.getNome());
        p3.imprime();
    }
}