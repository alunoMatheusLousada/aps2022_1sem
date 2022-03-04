/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import negocio.Pessoa;
import java.sql.*;

/**
 *
 * @author iapereira
 */
public class PessoaDAO implements DAO<Pessoa> {

    @Override
    public void obter(Pessoa p) throws SQLException {
        String sql = "SELECT * FROM pessoa WHERE cpf = ?;";
        Connection connection = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, p.getCpf());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            p.setId(rs.getInt("id"));
            p.setCpf(rs.getString("cpf"));
            p.setNome(rs.getString("nome"));
        }
        preparedStatement.close();
        connection.close();
    }

    @Override
    public ArrayList<Pessoa> listar() throws SQLException {
        ArrayList<Pessoa> vetPessoa = new ArrayList();
       String sql = "SELECT * FROM pessoa";
        Connection connection = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        Pessoa p = null;
        while (rs.next()) {
            p = new Pessoa();
            p.setId(rs.getInt("id"));
           p.setCpf(rs.getString("cpf"));
            p.setNome(rs.getString("nome"));
            vetPessoa.add(p);
        }
        preparedStatement.close();
        connection.close();
        return vetPessoa;
    }

    @Override
    public void inserir(Pessoa p) throws SQLException {
        String sql = "INSERT INTO pessoa (cpf, nome) VALUES (?, ?) RETURNING id;";
        Connection connection = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, p.getCpf());
        preparedStatement.setString(2, p.getNome());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            p.setId(rs.getInt("id"));
        }
        preparedStatement.close();
        connection.close();
    }

    @Override
    public void excluir(String chave) throws SQLException {
        String sql = "DELETE FROM pessoa WHERE cpf = ?;";
        Connection connection = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, chave);
        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }

    @Override
    public void atualizar(Pessoa p) throws SQLException {
        String sql = "UPDATE pessoa SET nome = ? WHERE cpf = ?;";
        Connection connection = new ConexaoPostgreSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, p.getNome());
        preparedStatement.setString(2, p.getCpf());
        preparedStatement.execute();
        preparedStatement.close();
        connection.close();
    }
}