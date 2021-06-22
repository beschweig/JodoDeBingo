// Direitos Autorais, 2021, Betina Schweig

import java.util.Scanner;
import java.util.Random;

/**
 * A classe {@code Auxiliar} contém dois subprogramas.
 * Um que sorteia os números para a cartela
 * Outro que faz o sorteio dos números para o usuário verifificar na cartela
 * @author Betina Schweig (betina.s@pucrs.br) 
 * matrícula: 21101864-3
 * @version 2021-06-22
 */
public class Auxiliar
{
    //SORTEAR OS NÚMEROS DA CARTELA
    /**
     * @param totalDeNumeros intervalo de números que podem ser sorteados 
     * @param numeroDeCartelas numero de cartelas
     * @param nPorCartela quantidade de números em cada cartela
     * @param cartela[] vetor que grava os números que já foram sorteados
     * @param repetido conta quantos números repetidos acontecem no sorteio
     */
    public static void init(int totalDeNumeros, int numeroDeCartelas, int nPorCartela, int cartela[],int repetido)
                                               
    {
        int[] init;
        Random sorteador = new Random();
        for(int contadorDeCartelas = 0; contadorDeCartelas < numeroDeCartelas; contadorDeCartelas ++) //variável contador de cartelas vai checar em qual cartela está. 
                                                //Começa em zero, toda vez que executar o for. Precisa ser menor que o número de total de cartelas sempre que começar, 
                                                //mas a cada nova repetição do laço for ele vai para a próxima cartela.
        {
            cartela = new int [nPorCartela]; //vetor cartela
            for(int contadorDeNumeros = 0; contadorDeNumeros < nPorCartela;)
            {
                repetido = 0;
                int numeroSorteado = sorteador.nextInt(totalDeNumeros);
                numeroSorteado = numeroSorteado + 1; //numero sorteado
                for(int verificaRepetido = 1; verificaRepetido <= cartela.length; verificaRepetido++) //laço for que vai impedir que o random escolha números repetidos.
                {
                    if(numeroSorteado == cartela[verificaRepetido - 1]) //Se o numeroSorteado for igual a algum número anterior da cartela...
                    {
                        repetido++; //...então soma um. 
                    }
                    else //Caso contrário...
                    {
                        repetido = repetido + 0; //...repetido recebe ele mesmo + zero, ou seja, não vai mudar.
                    }
                }     
                
                if (repetido == 0) //Se o número que foi repetido for igual a zero...
                {
                    cartela[contadorDeNumeros] = numeroSorteado; //...o contador de numeros da cartela recebe o novo número sorteado
                    contadorDeNumeros++; // e o contador passa para a próxima posição
                }
                else
                {
                
                }
            }
            System.out.printf("Sua cartela está aqui!\n", contadorDeCartelas);
            for(int i = 0; i < nPorCartela; i++)
            {
                System.out.printf("%d\n", cartela[i]);
            }
        }
    }
    
    //SORTEAR OS NÚMEROS
    /**
     * 
     */
    public static void sorteio()
    {
        int rpt = 0; //repetição
        int sort = 0; //sorteio
        int cont = 0; //contador
        int hist[] = new int[101]; //histórico de número que já foram sorteados
        int total; //total de números
        int e;
        
         do //Fazer isso...
        {
            Random rand = new Random(); //sortear os números
            rpt = 0;
            sort = 0;
            sort = rand.nextInt(100); //limite de até qual número pode ser sorteado (0 a 100)
            for(int i = 0; i < 100; i++)
            {
                if(sort == hist[i]) //Se o sorteio for igual a algum número do histórico (já sorteado)...
                {
                    rpt++; //número repetido recebe um
                    cont++; //contador avança um
                    if(cont == 101) //Se o contador chegar em um número igual ao total de números...
                    {
                        System.out.println("Todos os números foram sorteados");
                    }                    
                }
                else
                {
                    rpt = rpt + 0; //se o número não for repetido, recebe zero, ou seja, não muda
                }
            }
        }while(rpt != 0); ///...até a repetição ser diferente de zero

        System.out.println("---Digite 1 para sortear!");
        System.out.println("---Digite 2 para bingo!");
        System.out.println("---Digite 0 para sair do jogo!");
        
        do{ //fazer o sorteio...
            Scanner teclado = new Scanner(System.in);
            int escolha = teclado.nextInt();
            e = escolha;
            hist[cont] = sort;
            cont++;
            if (e == 1) ///se a pessoa digitar 1
            {
                System.out.printf("Número sorteado: " + sort + "\n"); //imprimir o número sorteado
                sorteio(); //retorna ao começo do método para sortear um novo número
            }
            teclado.close();
        }while(e == 1); //...enquanto usuário digitar 1
        if (e < 0 || e > 2) //se o número digitado for menor que zero ou maior que 2 não irá atender a nenhuma das opções
        {
        System.out.println("Valor inválido, digite novamente");
        }
        if(e == 2) //se o número digitado for igual a 2, quer dizer o usuário ganhou o jogo
        {
            System.out.println("Parabéns, você ganhou o jogo!");
            System.out.println("Digite 0 para sair do jogo!");
        }
        if(e == 0) //se o número digitado for igual a zero
        {
            System.exit(0); //Encerrar o jogo
        }      
    }
}