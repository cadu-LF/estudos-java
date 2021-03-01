package com.br.caelum.diferencas.de.variaveis;

/**
 *
 * @author Cadu Lourenço
 */
class ObjetoMeu{
    int valor;
}

public class TestaReferencia {
    public static void main(String... args){
        ObjetoMeu o1 = new ObjetoMeu();
        o1.valor = 10;
        ObjetoMeu o2 = o1; /** podemos fazer isso, assim teremos o2 referenciando
                            * o mesmo objeto que o1, com isso, qualquer mudança 
                            * feita no objeto o1, o2 terá o mesmo valor, pois o1
                            * e o2 referenciam um mesmo objeto que ocupa um 
                            * único espaço na memória.
                            * Isso só ocorre para variáveis que referenciam 
                            * objetos
                            */
        o1.valor += 5;
                           
        System.out.println(o1.valor);
        System.out.println(o2.valor);
        /**
         * nesse caso será impresso o valor 15 duas vezes, tanto para o1 qunato 
         * para o2, pois ambas as variáveis referenciam um mesmo objeto
         */
        
        int a = 10;
        int b = a; /** b copia o valor de a, porém qualquer alteração feita no 
                    * valor  de a, b não receberá essa mesma alteração, pois a e
                    * b ocupam dois espaços diferentes na memória
                    */
        
        a += 5; 
        
        System.out.println(a);
        System.out.println(b);
        /**
         * Nesse caso o valor de a = 15 e o valor de b = 10, pois foi somado 5
         * apenas para a variável a
         */
    }
}
