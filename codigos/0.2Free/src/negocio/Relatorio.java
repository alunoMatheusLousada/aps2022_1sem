/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Relatorio {
    
    public final void exibir(){
//        imutavel
        this.exibirCabecalho();
//        readData();
//        mutavel
        this.exibiConteudo();
//        transformData();
//        mutavel...
        this.exibirRodape();
//        exportData();
        
    }

    private void exibirCabecalho() {
        System.out.println("--- Relatorio -- ");
    }

    protected abstract void exibiConteudo();

    protected void exibirRodape() {
        System.out.println("Rodape...");
    }
    
}
