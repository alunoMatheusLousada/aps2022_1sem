/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Usuario;

/**
 *
 * @author iapereira
 */
public class UsuarioDAO {

    private Connection con;

    public void save(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (login, senha) VALUES (?,md5(?)) RETURNING id";
        this.con = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = this.con.prepareStatement(sql);
        preparedStatement.setString(1, usuario.getLogin());
        preparedStatement.setString(2, usuario.getSenha());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            usuario.setId(rs.getInt("id"));
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?;";
        this.con = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = this.con.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int resultado = preparedStatement.executeUpdate();

    }

}
