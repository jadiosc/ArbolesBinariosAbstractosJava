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
abstract public class abstractNodoBinario {
        protected Object dato;

        public Object getDato(){
            return dato;
        }

        public abstract NodoBinario getRamaIzquierda();
        public abstract void setRamaIzquierda(NodoBinario nodoIzq);
        public abstract NodoBinario getRamaDerecha();
        public abstract void setRamaDerecha(NodoBinario nodoDer);
}
