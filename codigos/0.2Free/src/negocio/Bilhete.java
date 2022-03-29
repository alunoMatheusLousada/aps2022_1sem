/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Bilhete {
    private String nomeFilme;
    private String lugar;
    private String sala;

    public Bilhete(String nome_filme, String lugar, String sala) {
        System.out.println("chegou o q aqui?"+nome_filme);
        this.nomeFilme = nome_filme;
        this.lugar = lugar;
        this.sala = sala;
    
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
    
    
}
