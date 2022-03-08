/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Produto;

/**
 *
 * @author iapereira
 */
public class ProdutoDAO {

    public static ArrayList<Produto> listarTodos() throws SQLException {
        ArrayList<Produto> vetProduto = new ArrayList();
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

    public void salvar(Produto produto) throws SQLException {
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "INSERT INTO produto (nome, valor) values (?, ?) returning id;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, produto.getNome());
        preparedStatement.setDouble(2, produto.getValor());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            produto.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        conexao.close();
    }

    public void load(Produto produto) throws SQLException {
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "SELECT * FROM produto WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, produto.getId());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getDouble("valor"));
        }
        preparedStatement.close();
        conexao.close();
    }

    public void deletar(int id) throws SQLException {
          Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "DELETE FROM produto WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int resultado = preparedStatement.executeUpdate();
        preparedStatement.close();
        conexao.close();
    }

    public void atualizar(Produto produto) throws SQLException {
         Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "UPDATE produto SET nome = ?,  valor = ? WHERE id = ?;";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, produto.getNome());
        preparedStatement.setDouble(2, produto.getValor());
        preparedStatement.setDouble(3, produto.getId());
        int resultado = preparedStatement.executeUpdate();
        preparedStatement.close();
        conexao.close();
    }

}
