package com.br.caelum.ciclo.vida.objeto;

import com.br.caelum.acesso.de.variaveis.Carro;

/**
 *
 * @author Cadu Lourenço
 */
class Carros{
    static Carro c1;
    static Carro c2;
}
public class TestaCicloDeVida {
     public static void main(String[] args) {
        /**Carro c; 
         *  Nesse caso, nenhum carro terá sido criado, pois não foi 
         *  chamado o contrutor e não foi atribuido new Carro() a "c"
         */
        
        Carro c = new Carro();
        /**
         * Foi criado um novo objeto para a classe Carro e a variável "c" 
         * referencia esse objeto ou um ponteiro para o objeto criado
         */
        c.ano = 2014;
        c.modelo = "Ferrari";
        /**
         * Podemos fazer qualquer coisa com o objeto referenciado pela variável 
         * "c", pois esse objeto é acessível por ter uma variável que referencia
         * ele
         */
        Carros.c1 = c;
        /**
         * na linha 32 fizemos uma referencia indireta ao objeto Carro.
         */
        
        // até esse ponto existe 1 objeto e 2 referencia para o mesmo (c e Carros.c1)
        
        c = new Carro();
        Carros.c2 = c;
        
        // na linha 40 foi criado uma referencia indireta ao objeto Carro criado na linha 39
        
        /**
         * com a linha 39, c deixa de referenciar o objeto que possuia ano=2014
         * e modelo = "Ferrari" e passa a referenciar um novo objeto. Com isso o
         * objeto que era anteriormente referenciado por c ficará apenas com a 
         * referencia indireta (Carros.c1)
         */
        
        // até esse ponto existem 2 objetos e 1 referencia direta para o segundo
        // e 2 referencia indiretas (Carros.c1 referencia o objeto 1 e Carros.c2 referencia o objeto 2)
        
        c = null;
        /**
         * faz com que a variável c não referencie nenhum objeto
         */
        
        // até esse ponto existem 2 objetos e nenhuma referencia direta a eles
        // apenas referencias indiretas (Carros.c1 e Carros.c2)
        
        if (15>10){
            Carro c2 = new Carro();
            c2.ano = 2015; 
            /**
             * aqui c2 só referencia um objeto dentro do if (por ser uma 
             * variável que tem o escopo apenas para dentro do if), fora do if 
             * esse objeto se torna inacessível.
             * O MESMO VALE PARA UM "for"
             */
        } 
        
        /** A partir desse ponto o primeiro objeto criado PODE SER jogado fora
         * (uma vez que, o primeiro objeto deixou de ser acessível e essa é a 
         * condição para que um objeto seja excluído da memória), mas NÃO QUER
         * DIZER que ele já foi jogado fora
         */
        
        // até esse ponto existem 3 objetos e nenhuma referecia direta para eles
        // apenas referencias indiretas para os dois primeiros (Carros.c1, Carros.c2)
        
        Carro c3;
        for(int i = 0; i<10; i++){
            c3 = new Carro();
        }
            
        /**
         * o último objeto criado poderá ser acessado, pois a variável c3 foi 
         * criada antes do for, e assim ela existe antes do for, durante o for e
         * depois do for
         */
        
        // até esse ponto, existem 13 objetos e 1 referencia direta para o último objeto criado
        // apenas referencias indiretas para os dois primeiros (Carros.c1, Carros.c2)
        
        new Carro(); 
        /**
         * Aqui foi criado um novo objeto da classe Carro na memória, porém não 
         * há nada o referenciando
         * Esse objeto não é acessível, pois não há nenhuma variável o 
         * referenciando
         */
    }
}
