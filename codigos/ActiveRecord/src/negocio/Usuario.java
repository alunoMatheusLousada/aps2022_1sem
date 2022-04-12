/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.sql.*;
import persistencia.ConexaoPostgreSQL;

/**
 *
 * @author iapereira
 */
public class Usuario {

    private int id;
    private String login;
    private String senha;
    private Connection con;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void save() throws SQLException {
        String sql = "INSERT INTO usuario (login, senha) VALUES (?,md5(?)) RETURNING id";
        this.con = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = this.con.prepareStatement(sql);
        preparedStatement.setString(1, this.login);
        preparedStatement.setString(2, this.senha);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            this.id = rs.getInt("id");
        }
    }

    public void delete() throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?;";
        this.con = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = this.con.prepareStatement(sql);
        preparedStatement.setInt(1, this.id);
        int resultado = preparedStatement.executeUpdate();

    }
}
