/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */

// caso seja unidirecional, ou seja, somente o Projeto sabe dos seus funcionarios!!!
public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Empregado> vetFuncionario;

    public Projeto() {
        this.vetFuncionario = new ArrayList();
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

    public ArrayList<Empregado> getVetFuncionario() {
        return vetFuncionario;
    }

    public void setVetFuncionario(ArrayList<Empregado> vetFuncionario) {
        this.vetFuncionario = vetFuncionario;
    }
    
    
    
    
}
