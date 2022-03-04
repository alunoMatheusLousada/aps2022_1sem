/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Empregado {
    private int id;
    private String nome;
    // caso fosse bidirecional, haveria um array list de projeto aqui tb como atributo de empregado!!!
//    ex: private ArrayList<Projeto> vetProjeto;
    
    
    public Empregado(){
        
    }

    public Empregado(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
