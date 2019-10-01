/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

/**
 *
 * @author Alumno
 */
public class NodoBinario extends abstractNodoBinario{
    protected NodoBinario _nodoBinarioIzq;
    protected NodoBinario _nodoBinarioDer;
    
    @Override
    public NodoBinario getRamaIzquierda() {
        return _nodoBinarioIzq;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRamaIzquierda(NodoBinario nodoIzq) {
        _nodoBinarioIzq=nodoIzq;
    }

    @Override
    public NodoBinario getRamaDerecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRamaDerecha(NodoBinario nodoDer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
