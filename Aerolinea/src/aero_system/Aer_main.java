
package aero_system;

import aero_view.Aer_formulario;

public class Aer_main extends Thread{

    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
        	public void run() {
                new Aer_formulario().setVisible(true);
            }
        });
    }
}