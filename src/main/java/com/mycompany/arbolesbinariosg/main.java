
package com.mycompany.arbolesbinariosg;

import ArbolBinario.ArbolBinario;
import ArbolBinario.ArbolBinarioGrafico;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Quiej
 */
public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            ArbolBinario arbol = new ArbolBinario();
            arbol.insertarNodoCadena("15,9,20,6,14,17,64,13,26,72");
 
                System.out.println("Ordenamiento preOrden");
                ArbolBinario.preOrden(arbol.getRaiz());
                System.out.println("Ordenamiento postOrden");
                ArbolBinario.postOrden(arbol.getRaiz());
                System.out.println("Ordenamiento inOrden");
                ArbolBinario.inOrden(arbol.getRaiz());
                
                JFrame frame = new ArbolBinarioGrafico();
                frame.setSize(800, 500);
                frame.setVisible(true);
            }
        });
    }
}
