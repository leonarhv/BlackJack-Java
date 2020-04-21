/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.baralho;

/**
 *
 * @author leona
 */
public class Carta {
    String nome;
    String naipe;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return this.nome + " de " + this.naipe; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
