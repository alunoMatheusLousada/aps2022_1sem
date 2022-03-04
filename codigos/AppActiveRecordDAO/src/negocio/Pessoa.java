/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.ConexaoPostgreSQL;
import persistencia.PessoaDAO;

/**
 *
 * @author iapereira
 */
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private PessoaDAO pessoaDAO;

    public Pessoa() {
       this.pessoaDAO = new PessoaDAO();
    }

    public Pessoa(String cpf, String nome) {
        this();
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void obter(String cpf) throws SQLException {
        this.cpf = cpf;
        this.pessoaDAO.obter(this);
    }

    public void excluir() throws SQLException {
        this.pessoaDAO.excluir(cpf);
    }

    public void inserir() throws SQLException {
        this.pessoaDAO.inserir(this);
    }

    public void atualizar() throws SQLException {
        this.pessoaDAO.atualizar(this);
    }

    public ArrayList<Pessoa> listar() throws SQLException {
        return this.pessoaDAO.listar();
    }

}
