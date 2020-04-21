/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.modelo;

import blackjack.baralho.Carta;
import blackjack.estruturas.Pilha;

/**
 *
 * @author leona
 */
public class Jogador {
    private String nome;
    private Pilha cartas = new Pilha(52);
    private boolean winner;
    private boolean gameOver;
    private int pontos;
            
    public Jogador(String nome) {
        this.pontos = 0;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addCarta(Carta carta) {
        this.cartas.push(carta);
        
        // Adicionar pontuação
        this.calculaPontos(carta);
    }

    public boolean isWinner() {
        if (this.getPontos() == 21) {
            this.winner = true; 
            this.setGameOver(true);
        }
        
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getPontos() {
        return pontos;
    }

    public void addPontos(int pontos) {
        this.pontos += pontos;
    }

    public Pilha getCartas() {
        return cartas;
    }

    public boolean isGameOver() {
        if (this.getPontos() > 21) {
            this.setGameOver(true);
        }
        
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    public String printUltimaCarta(){
        return ("Carta " + (this.getCartas().size()) + " do jogador " + this.getNome() + ": " + "[" + this.getCartas().top() + "]");
    }
    
    public void calculaPontos(Carta carta) {
        if (carta.toString().startsWith("As")) this.addPontos(1);
        else if (carta.toString().startsWith("2")) this.addPontos(2);
        else if (carta.toString().startsWith("3")) this.addPontos(3);
        else if (carta.toString().startsWith("4")) this.addPontos(4);
        else if (carta.toString().startsWith("5")) this.addPontos(5);
        else if (carta.toString().startsWith("6")) this.addPontos(6);
        else if (carta.toString().startsWith("7")) this.addPontos(7);
        else if (carta.toString().startsWith("8")) this.addPontos(8);
        else if (carta.toString().startsWith("9")) this.addPontos(9);
        else if (carta.toString().startsWith("10")) this.addPontos(10);
        else if (carta.toString().startsWith("Valete")) this.addPontos(10);
        else if (carta.toString().startsWith("Rainha")) this.addPontos(10);
        else if (carta.toString().startsWith("Rei")) this.addPontos(10);
    }
    
}
