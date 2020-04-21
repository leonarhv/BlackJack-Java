/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.modelo;

import blackjack.baralho.Carta;

/**
 *
 * @author leona
 */
public class Mesa {
    private Carta cartaFaceCima;
    private Carta cartaFaceBaixo;

    public Carta getCartaFaceCima() {
        return cartaFaceCima;
    }

    public void setCartaFaceCima(Carta cartaFaceCima) {
        this.cartaFaceCima = cartaFaceCima;
    }

    public Carta getCartaFaceBaixo() {
        return cartaFaceBaixo;
    }

    public void setCartaFaceBaixo(Carta cartaFaceBaixo) {
        this.cartaFaceBaixo = cartaFaceBaixo;
    }
    
}
