/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.RelatorioCompras;
import negocio.RelatorioVendas;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RelatorioCompras relatorioCompras = new RelatorioCompras();
        relatorioCompras.exibir();
        
        RelatorioVendas relatorioVendas = new RelatorioVendas();
        relatorioVendas.exibir();
    }
    
}
