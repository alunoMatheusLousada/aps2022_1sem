/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class RelatorioCompras extends Relatorio {

    @Override
    protected void exibiConteudo() {
        System.out.println("Relatorio de Compras...");
    }
    
     protected void exibirRodape() {
        System.out.println("Rodape novo exclusivo para o relatorio de compras......");
    }
   
}
