package com.br.caelum.metodos;

/**
 *
 * @author Cadu Lourenço
 */
class Calculadora{
    public int soma(int... nros){/** podem ser passados quandos argumentos quiser
                                * nros é um array de varios argumentos (VARARGS) 
                                * só podem ser um único tipo e deve ser o último
                                * argumento da função.
                                * um VARAGS é um array, mas um array não é um VARARGS, 
                                * por isso um VARAGS aceita vários argumentos como uma array, 
                                * mas uma array só aceita outra array como parâmetro
                                */
        int soma = 0;
        for(int i = 0; i < nros.length; i++){
            soma += nros[i];
        }
        return soma;
    }
}

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.soma(3, 5));
        System.out.println(c.soma(3, 5, 10, 5));
        System.out.println(c.soma(3, 5, 10, 5, 7));
        System.out.println(c.soma(3));
        System.out.println(c.soma());
        System.out.println(c.soma(new int[]{3, 4})); // passei um array como parâmetro

    }
}
