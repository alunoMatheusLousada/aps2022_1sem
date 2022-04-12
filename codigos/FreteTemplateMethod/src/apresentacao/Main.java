/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Economica;
import negocio.Sedex;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedex sedex = new Sedex();
        System.out.println("Sedex:"+sedex.calcFrete(10));
        Economica economica = new Economica();
        System.out.println("Economica:"+economica.calcFrete(10));
    }
    
}
