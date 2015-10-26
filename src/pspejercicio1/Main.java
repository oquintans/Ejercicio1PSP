/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oquintansocampo
 */
public class Main extends Thread {

    public Main(String nom) {
        super(nom);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Main("Hilo1").start();
        new Main("Hilo2").start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Nombre: " + getName() + "\nNumero: " + i + "\n");
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
