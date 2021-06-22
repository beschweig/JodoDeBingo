// Direitos Autorais, 2021, Betina Schweig

import java.util.Scanner;
import java.util.Random;
/**
 * A classe {@code MainApp} contém um programa que 
 * simula uma partida do jogo Bingo, 
 * apresenta mensagens de orientação ao usuário e que
 * verifica as entradas informadas pelo usuário.
 * 
 * @Betina Schweig
 * matrícula: 21101864-3
 * @version 2021-06-22
 */
public class Mainapp
{
                                                                                                                                                                                                                                                                                   
    public static void main(String[] args)
    {
        System.out.print("\f"); //limpar o terminal antes da execução do programa
        System.out.println("JOGO DE BINGO");
        
        int rpt = 0; //repetição
        int sort = 0; //sorteio
        int cont = 0; //contador
        int hist[] = new int[100];
        int total;
        int e;

        int totalDeNumeros = 50; //Números sorteados vão de 0 até 50
        int numeroDeCartelas = 1; //Nesse exemplo será usada só uma cartela, mas essa 
                                  //variável faz com que seja possível, futuramente, aumentar o número de cartelas caso seja necessário.
        int nPorCartela = 10; //Quantidade de números em cada cartela
        int cartela[] = new int[nPorCartela]; //Vetor com 50 posições para gravar os números que já saíram.
                                                //Tem que ser do mesmo tamanho que o total de números.
        int repetido = 0; //Conta quantos números repetidos acontecem no sorteio
        Auxiliar.init(totalDeNumeros, numeroDeCartelas, nPorCartela, cartela, repetido); //auxiliar referenciada
        Auxiliar.sorteio(); //auxiliar referenciada
       
    }
}




