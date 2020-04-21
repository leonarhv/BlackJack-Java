/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.baralho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author leona
 */
public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<Carta>();

    public Baralho() {
        String[] nomes = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Rainha", "Valete", "Rei"};
        String[] naipes = {"Paus", "Copas", "Espadas", "Ouros"};
        
        for (String naipe : naipes) {
            for (String nome : nomes) {
                Carta carta = new Carta();
                carta.setNome(nome);
                carta.setNaipe(naipe);
                cartas.add(carta);
            }
        }
    }
    
    public void imprimeBaralho() {
        System.out.println(cartas.toString());
    }
    
    public Carta retiraCarta() {
        Random rnd = new Random();
        return cartas.get(rnd.nextInt(cartas.size()));
    }
    
    public void embaralha() {
        Random rnd = new Random();
        Carta aux;
        for (int i = cartas.size() - 1; i > 1; i--) {
            int j = rnd.nextInt(i + 1);
            aux = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, aux);
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
    
}
