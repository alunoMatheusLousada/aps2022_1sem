/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Assinante;
import negocio.AssinantePJ;
import negocio.Noticia;
import negocio.Portal;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Portal portal = new Portal();
        Assinante betito = new Assinante("Betito");
        portal.addObserver(betito);
        Assinante igor = new Assinante("Igor");
        portal.addObserver(igor);
        portal.addNoticia(new Noticia("Prova dia 19/04", "Ocorrerá no dia 19/04 a prova de aps"));
    
        portal.removeObserver(betito);
        
        System.out.println("======================");
        
        portal.addObserver(new AssinantePJ("COMP@SSO"));
        
        
        portal.addNoticia(new Noticia("Novo reitor do ifrs", "prof. Betito será o novo reitor do ifrs. viverá agora na serra gaucha"));

        
    }
    
}
