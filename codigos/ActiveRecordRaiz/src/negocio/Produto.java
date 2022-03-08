/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.sql.*;
import java.util.ArrayList;
import persistencia.ConexaoPostgreSQL;

/**
 *
 * @author iapereira
 */
public class Produto {

    private int id;
    private String nome;
    private double valor;

    public Produto() {

    }

    public Produto(int id, String nome, double valor) {
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
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "INSERT INTO produto (nome, valor) values (?, ?) returning id;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, this.nome);
        preparedStatement.setDouble(2, this.valor);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            this.id = rs.getInt("id");
        }
        preparedStatement.close();
        conexao.close();

    }

    public static ArrayList<Produto> listar() throws SQLException {
        ArrayList<Produto> vetProduto = new ArrayList<Produto>();
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "SELECT * FROM produto;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            vetProduto.add(new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("valor")));
        }
        preparedStatement.close();
        conexao.close();
        return vetProduto;
    }

    public String toString() {
        return this.id + ";" + this.nome + ";" + this.valor;
    }

    public void delete() throws SQLException {
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "DELETE FROM produto WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, this.id);
        int resultado = preparedStatement.executeUpdate();
        preparedStatement.close();
        conexao.close();
    }

    public void load(int id) throws SQLException {
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "SELECT * FROM produto WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            this.id = rs.getInt("id");
            this.nome = rs.getString("nome");
            this.valor = rs.getDouble("valor");
        }
        preparedStatement.close();
        conexao.close();
    }

    public void update() throws SQLException {
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "UPDATE produto SET nome = ?,  valor = ? WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, this.nome);
        preparedStatement.setDouble(2, this.valor);
        preparedStatement.setDouble(3, this.id);
        int resultado = preparedStatement.executeUpdate();
        preparedStatement.close();
        conexao.close();

    }

}
