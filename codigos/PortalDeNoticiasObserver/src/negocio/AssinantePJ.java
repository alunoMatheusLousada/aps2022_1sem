/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class AssinantePJ implements Observer{
    
    private String cnpj;
    private String nomeFantasia;

    public AssinantePJ(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void update(Noticia noticia) {
        System.out.println(this.nomeFantasia+": recebeu e n vai ler nunca...");
    }
    
}
