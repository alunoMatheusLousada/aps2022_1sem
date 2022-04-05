/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Cliente;
import negocio.Placa;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Placa portal = new Placa();
        Cliente betito = new Cliente("Betito");
        portal.addObserver(betito);
        Cliente igor = new Cliente("Igor");
        portal.addObserver(igor);
        
        portal.setCaixaVaga(3);
//        portal.addNoticia(new Noticia("Prova dia 19/04", "Ocorrerá no dia 19/04 a prova de aps"));
    
//        portal.removeObserver(betito);
        
        
        
        
//        portal.addNoticia(new Noticia("Novo reitor do ifrs", "prof. Betito será o novo reitor do ifrs. viverá agora na serra gaucha"));

        
    }
    
}
