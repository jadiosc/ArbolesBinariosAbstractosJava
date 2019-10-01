/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

/**
 *
 * @author Augusto
 */
public abstract class abstractArbolBinario {
    protected NodoBinario _raiz;

    public abstract void setNodoBinario(NodoBinario raiz);
    public abstract NodoBinario getNodoBinario();
    public abstract NodoBinario getRamaIzquierda();
    public abstract NodoBinario getRamaDerecha();
    
    abstract public boolean esVacio();
    abstract public int nivel();
    abstract public int altura();
    abstract public int numNodos();
    
    public abstractArbolBinario(NodoBinario raiz)
    {
        _raiz = raiz;
    }
    
    public abstractArbolBinario()
    {
        _raiz = null;
    }
    
    public abstract String preorden();
    public abstract String inorden();
    public abstract String postorden();    
}
