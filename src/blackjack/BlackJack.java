/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import blackjack.modelo.Dealer;
import blackjack.modelo.Jogador;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("-------------------------------");
        System.out.printf("%20s\n", "BlackJack");
        System.out.println("-------------------------------");
        
        while(true) {
            Dealer dealer = new Dealer();
            System.out.println("Informe o nome do jogador para começar um jogo:");
            String nome = leia.nextLine();
            Jogador jogador = new Jogador(nome);
            
            dealer.primeiraRodadaCartasPlayer(jogador);
            
            System.out.println("\nQuantidade cartas do Jogador " + jogador.getNome() + ": [" + jogador.getCartas().size() + "]");
            System.out.println("Soma das cartas do jogador: [" + jogador.getPontos() + "]");
            
            System.out.println("Pilha de cartas do jogador:");
            System.out.println(jogador.getCartas().toString());
            
            if (jogador.isGameOver() && !jogador.isWinner()) {
                System.out.println("\nVocê passou de 21 pontos, GAME OVER");
            }
            
            else if (jogador.isWinner()) {
                System.out.println("\nParabéns, você ganhou!!!");
            }
                        
            System.out.println("\n-------------------------------");
            
            System.out.println("Deseja continuar? [S/N]");
            String continuar = leia.nextLine().toUpperCase().substring(0, 1);
            
            if (continuar.equals("N")) break;
        }
    }
    
}
