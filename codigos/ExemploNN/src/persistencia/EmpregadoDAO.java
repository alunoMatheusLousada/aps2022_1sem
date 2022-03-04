/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Empregado;
import negocio.Projeto;

/**
 *
 * @author iapereira
 */
public class EmpregadoDAO {

    public Empregado obter(int id) throws SQLException {
        Empregado empregado = new Empregado();
        String sql = "SELECT * FROM empregado WHERE id = ?";       
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){ 
            empregado.setId(rs.getInt("id"));
            empregado.setNome(rs.getString("nome"));
        }
        preparedStatement.close();
        conexao.close();
        return empregado;
    }
    
}
