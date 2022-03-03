/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Pessoa implements IPessoa{
    protected String nome;
    protected int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public abstract double vencimento();
    
    public void imprime(){
        System.out.println("Id:"+this.id);

        System.out.println("Nome:"+this.nome);
    }
    
}
