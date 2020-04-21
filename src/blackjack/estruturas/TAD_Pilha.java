/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.estruturas;

/**
 *
 * @author leona
 */
public interface TAD_Pilha {
    public Object push(Object x);
    
    public Object pop();
    
    public boolean isEmpty();
    
    public boolean isFull();
    
    public Object top();
    
    @Override
    public String toString();
}
