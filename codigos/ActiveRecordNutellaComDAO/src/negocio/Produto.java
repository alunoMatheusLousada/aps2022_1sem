/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.sql.*;
import java.util.ArrayList;
import persistencia.ConexaoPostgreSQL;
import persistencia.ProdutoDAO;

/**
 *
 * @author iapereira
 */
public class Produto {

    private int id;
    private String nome;
    private double valor;
    
    
    private ProdutoDAO produtoDAO;

    public Produto() {
        this.produtoDAO = new ProdutoDAO();

    }

    public Produto(int id, String nome, double valor) {
        this();
        this.id = id;
        this.nome = nome;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void save() throws SQLException {
           this.produtoDAO.salvar(this);

    }

    public static ArrayList<Produto> listar() throws SQLException {
        return ProdutoDAO.listarTodos();
    }

    public String toString() {
        return this.id + ";" + this.nome + ";" + this.valor;
    }

    public void delete() throws SQLException {
        this.produtoDAO.deletar(this.id);
    }

    public void load(int id) throws SQLException {
        this.id = id;
        this.produtoDAO.load(this);
    }

    public void update() throws SQLException {
        this.produtoDAO.atualizar(this);

    }

}
