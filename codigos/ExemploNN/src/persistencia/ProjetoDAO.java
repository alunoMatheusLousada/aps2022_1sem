/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import negocio.Projeto;
import java.sql.*;
import negocio.Empregado;

/**
 *
 * @author iapereira
 */
public class ProjetoDAO {
    
//    A ideia eh refatorar o listar pois do jeito que está somente projetos com empregados serão listados
    
    public ArrayList<Projeto> listar() throws SQLException{
        ArrayList<Projeto> vetProjeto = new ArrayList<>();        
//        coloquei um order by projeto.nome para listar os projetos em ordem
        String sql = "SELECT projeto.nome as projeto_nome, empregado.nome as empregado_nome, * FROM empregado inner join empregado_projeto on (empregado.id = empregado_projeto.empregado_id) right join projeto on (projeto.id = empregado_projeto.projeto_id) order by projeto.nome ";       
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        int projeto_id = 0;
        Projeto projeto = null;     
        while (rs.next()){ 
            if (/*projeto_id == 0 ||*/ projeto_id != rs.getInt("projeto_id")) {                
                projeto = new Projeto();                
                vetProjeto.add(projeto);
            } 
            projeto.setId(rs.getInt("projeto_id"));
            projeto.setNome(rs.getString("projeto_nome"));
            projeto_id = rs.getInt("projeto_id");
            if (rs.getInt("empregado_id") > 0) {
                projeto.getVetFuncionario().add(new Empregado(rs.getInt("empregado_id"), rs.getString("empregado_nome")));
            }
        }     
        //        removi a "gambiarra" que estava heheheh
//        vetProjeto.remove(0);
//        vetProjeto.add(projeto);
        preparedStatement.close();
        conexao.close();
        return vetProjeto;
    }

    public Projeto obter(int id) throws SQLException {        
        String sql = "SELECT projeto.nome as projeto_nome, empregado.nome as empregado_nome, * FROM empregado  inner join empregado_projeto on (empregado.id = empregado_projeto.empregado_id)  inner join projeto on (projeto.id = empregado_projeto.projeto_id) WHERE projeto.id = ?; ";       
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();        
        Projeto projeto = new Projeto();     
        while (rs.next()){ 
            projeto.setId(rs.getInt("projeto_id"));
            projeto.setNome(rs.getString("projeto_nome"));
            projeto.getVetFuncionario().add(new Empregado(rs.getInt("empregado_id"), rs.getString("empregado_nome")));
        }     
        preparedStatement.close();
        conexao.close();
        return projeto;
    }

    public boolean adicionarEmpregado(Projeto projeto, Empregado empregado) throws SQLException {        
        String sql = "INSERT INTO empregado_projeto (empregado_id, projeto_id) VALUES (?, ?);";       
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, empregado.getId());
        preparedStatement.setInt(2, projeto.getId());
        int resultado = preparedStatement.executeUpdate();        
        if (resultado == 1) {
            projeto.getVetFuncionario().add(empregado);            
            preparedStatement.close();
            conexao.close();
            return true;
        }          
        preparedStatement.close();
        conexao.close();
        return false;
    }    

    public boolean removerEmpregado(Projeto projeto, Empregado empregado) throws SQLException {        
        String sql = "DELETE FROM empregado_projeto WHERE empregado_id = ? AND projeto_id = ?;";       
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, empregado.getId());
        preparedStatement.setInt(2, projeto.getId());
        int resultado = preparedStatement.executeUpdate();        
        if (resultado == 1) {
//            ajustando a referencia da memoria, ou seja, ajustando o vetor de empregado tb para o objeto de projeto
            projeto.getVetFuncionario().remove(empregado);            
            preparedStatement.close();
            conexao.close();
            return true;
        }          
        preparedStatement.close();
        conexao.close();
        return false;
        
    }
}