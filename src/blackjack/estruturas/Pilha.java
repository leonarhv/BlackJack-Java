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
public class Pilha implements TAD_Pilha {
    
    private int topo;
    private int max;
    private Object memo[];

    public Pilha(int qtde) {
        this.topo = -1;
        this.max = qtde;
        this.memo = new Object[max];
    }

    @Override
    public Object push(Object x) {
        if (!isFull() && x != null) {
            memo[++topo] = x;
            return x;
        }
        return null;
    }
    
    public int size() {
        return topo + 1;
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            return memo[topo--];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (topo == -1);
    }

    @Override
    public boolean isFull() {
        return (topo == max - 1);
    }

    @Override
    public Object top() {
        if (!isEmpty()) {
            return memo[topo];
        }
        return null;
    }  

    @Override
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += memo[i].toString();
                if(i != topo) msg += ", ";
            }
            return ("[" + msg + "]");
        }
        else return "Baralho vazio!";
    }
    
}
