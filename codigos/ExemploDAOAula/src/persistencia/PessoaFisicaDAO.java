/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import negocio.PessoaFisica;
import java.sql.*;

/**
 *
 * @author iapereira
 */
public class PessoaFisicaDAO implements DAO<PessoaFisica>{
    
//    public void adicionar(PessoaFisica pessoaFisica){
//        System.out.println("INSERT INTO pessoafisica(cpf, nome) values ('"+pessoaFisica.getCpf() +"','" + pessoaFisica.getNome()+"');");
//    }

    @Override
    public void inserir(PessoaFisica t) throws Exception{
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement("INSERT INTO pessoa (nome) values (?);");
        preparedStatement.setString(1, t.getNome());
        preparedStatement.execute();        
    }
    
    
    @Override
    public void atualizar(PessoaFisica t) throws Exception{
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement("UPDATE pessoa SET nome = ? WHERE id = ?;");
        preparedStatement.setString(1, t.getNome());
        preparedStatement.setInt(2, t.getId());
        preparedStatement.execute();        
    }
    
       @Override
    public void excluir(int id) throws Exception{
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        PreparedStatement preparedStatement = conexao.prepareStatement("DELETE FROM pessoa WHERE id = ?;");
        preparedStatement.setInt(1, id);
        preparedStatement.execute();        
    }

    @Override
    public ArrayList<PessoaFisica> listar() throws Exception{
        ArrayList<PessoaFisica> vetPessoa = new ArrayList<PessoaFisica>();
        String sql = "SELECT * FROM pessoa;";
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        ResultSet rs = conexao.prepareStatement(sql).executeQuery();
        while (rs.next()){
            vetPessoa.add(new PessoaFisica(rs.getString("nome"), rs.getInt("id")));
        }
        return vetPessoa;
    }
    
}
