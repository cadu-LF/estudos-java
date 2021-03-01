package com.br.caelum.acesso.de.variaveis;

/**
 *
 * @author Cadu Lourenço
 */
public class Carro {
    public String modelo;
    public int ano;
    
    public Carro(){
        this.ano = 2014;
    }
    
    public void reseta(){
        this.ano = 2014; /** podemos escrever tanto "this.ano", como apenas 
                          * "ano" pois já estamos dentro da classe, que os 
                          * objetos terão "ano" como atributo
                          */
    }
    
    public String imprimeDados(){
        return modelo + "::" + ano;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
}
