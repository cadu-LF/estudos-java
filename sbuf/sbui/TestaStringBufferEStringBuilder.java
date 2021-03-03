package com.br.caelum.sbuf.sbui;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaStringBufferEStringBuilder {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Caelum");
        /**
         * o StringBuffer é um espaço que permite adicionar mais coisas dentro 
         * da StringBuffer
         * StringBuffer é  MUTÁVEL
         * * StringBuilder não sincroniza o acesso aos métodos
         */
        buffer.append(" - "); /**
         * concatena mais coisas dentro do StringBuffer
         */
        buffer.append("Ensino e Inovação");
        System.out.println(buffer.toString());// toString() -> retorna o valor em forma de String
        
        /**
         * também é possível criar um StringBuffer e definir seu tamanho máxmio
         */ 
        StringBuffer buffer2 = new StringBuffer(10); // tamanho máximo = 10
        System.out.println(buffer2.toString());

        StringBuffer buffer3 = new StringBuffer(buffer);
        buffer3.append(" e Alura e Casa do Código");
        System.out.println(buffer3);
        
        StringBuffer j = new StringBuffer(" João");
        
        StringBuilder builder = new StringBuilder();
        /**
         * StringBuilder é uma função adicionada a versão de Java posteriores a 
         * versão inicial. 
         * tem as mesmas funções do StringBuffer, porém ele  sincroniza o acesso
         * aos métodos
         */
        
        /**
         * append aceita: uma String, um único caracter, um outro StringBuffer
         * ou StringBuilder e um objeto qualquer que será chamado o método 
         * roString() para transformar o valor do objeto em uma Strng
         */
        builder.append("Cadu ");
        System.out.println(builder);
        builder.append('e');
        System.out.println(builder);
        builder.append(j);
        System.out.println(builder);
        
        /**
         * insert() -> insere uma String em determinado local da String que já existe
         * insert(posição, "texto que  vai ser adicionado na posição")
         */
        StringBuilder builder2 = new StringBuilder("Imanação");
        builder2.insert(3, "gi");
        System.out.println(builder2);
        
        /**
         * delete() -> deleta os caracteres dentro do intervalo de posições especificado
         * delete(pi, pf) -> [pi, pf[
         * pi = posição inicial
         * pf = posição final
         */
        // imaginação
        // 0123456789
        builder2.delete(7, 10);
        System.out.println(builder2);
        
        /**
         *reverse() -> coloca um String ao contrário;
         */
        //System.out.println(builder2.reverse());
        
        /** 
         * trim() -> remove os espaços em branco a direita e a esquerda da String
         * charAt() -> pega o caracter na posição x
         * length() -> retorna o número de caracteres da String
         * equals() -> compara se duas Strings são iguais
         * indexOf() -> procura do COMEÇO AO FINAL da String e retorna a 
         * primeira posição que o elemento estre parênteses se encontra
         * lastIndexOf() -> procura do FINAL AO COMEÇO da String e retorna a 
         * primeira posição que o elemento estre parênteses se encontra
         * substring() / subSequence() -> pega um pedaço da String. Não altera a String original, 
         * apenas retorna um valor
         */
        System.out.println(builder2);
        System.out.println(builder2.substring(2, 5)); // [2, 5[
        
    }
}
