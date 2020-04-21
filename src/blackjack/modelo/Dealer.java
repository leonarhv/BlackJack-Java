/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.modelo;

import blackjack.baralho.Baralho;
import blackjack.baralho.Carta;
import blackjack.estruturas.Pilha;

/**
 *
 * @author leona
 */
public class Dealer {
    public Pilha baralhoPilha = new Pilha(52);
    private Mesa mesa = new Mesa();
            
    // Pilha
    // metodo entregar

    public Dealer() {
        Baralho baralho = new Baralho();
        baralho.embaralha();
        
        for (int i = 0; i < baralho.getCartas().size(); i++) {
            baralhoPilha.push(baralho.getCartas().get(i));
        }
    }
    
    public void primeiraRodadaCartasPlayer(Jogador jogador) {
        for (int i = 0; i < 2; i++) {
            jogador.addCarta((Carta) baralhoPilha.pop());
            System.out.println(jogador.printUltimaCarta());
        }
        
        primeiraRodadaCartasMesa(mesa, jogador);
        
        if (!jogador.isWinner() && !jogador.isGameOver()) {
            this.segundaRodadaCartasPlayer(jogador);
        }
        
    }
    
    public void primeiraRodadaCartasMesa(Mesa mesa, Jogador jogador) {
        mesa.setCartaFaceCima((Carta) baralhoPilha.pop());
        jogador.addCarta(mesa.getCartaFaceCima());
        
        System.out.println("Carta 1 da mesa: [" + jogador.getCartas().top() + "]");
        
        mesa.setCartaFaceBaixo((Carta) baralhoPilha.pop());
    }
    
    public void segundaRodadaCartasPlayer(Jogador jogador) {
        jogador.addCarta(mesa.getCartaFaceBaixo());
        System.out.println("Carta 2 da mesa: [" + jogador.getCartas().top() + "]");
        
        if (!jogador.isWinner() && !jogador.isGameOver()) {
            this.terceiraRodadaCartasPlayer(jogador);
        }
    }
    
    public void terceiraRodadaCartasPlayer(Jogador jogador) {
        jogador.addCarta((Carta) baralhoPilha.pop());
        System.out.println(jogador.printUltimaCarta());
        
        if (!jogador.isWinner() && !jogador.isGameOver()) {
            this.quartaRodadaCartasPlayer(jogador);
        }
    }
    
    public void quartaRodadaCartasPlayer(Jogador jogador) {
        while (!jogador.isWinner() && !jogador.isGameOver()) {            
            jogador.addCarta((Carta) this.baralhoPilha.pop());
            System.out.println(jogador.printUltimaCarta());
        }
    }
}
