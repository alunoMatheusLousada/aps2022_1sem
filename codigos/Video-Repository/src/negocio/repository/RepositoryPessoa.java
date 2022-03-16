/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Pessoa;
import persistencia.PessoaDAO;

/**
 *
 * @author iapereira
 */
public class RepositoryPessoa implements Repository<Pessoa>{
    private PessoaDAO pessoaDAO;
    private RepositoryStrategy strategy;

    public RepositoryPessoa() {
        this.pessoaDAO = new PessoaDAO();
        this.strategy = new SqlRepositoryStrategy();
    }  
    
    
    @Override
    public void salvar(Pessoa t) {
        try {
            this.pessoaDAO.inserir(t);
        } catch (SQLException ex) {
            Logger.getLogger(RepositoryPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @Override
    public Pessoa recuperar(int id) {
        try {
            return this.pessoaDAO.obter(id);
        } catch (SQLException ex) {
            Logger.getLogger(RepositoryPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Pessoa> listar() {
        try {
            return this.pessoaDAO.listar();
        } catch (SQLException ex) {
            Logger.getLogger(RepositoryPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Pessoa recuperarPorCpf(String cpf) throws SQLException{
        
        Query q = new Query();
        q.setTableName("pessoa");
        Criteria criteria = new Criteria();
        criteria.setField("cpf");
        criteria.setOperator("=");
        criteria.setValue("'"+cpf+"'");        
        q.getCriterias().add(criteria);        
        String sql = this.strategy.matching(q);
//        System.out.println(sql);
//        System.exit(0);
        
        Pessoa p = this.pessoaDAO.findOne(sql);     
        
        return p;
    }

    public RepositoryStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RepositoryStrategy strategy) {
        this.strategy = strategy;
    }

    
    

    
}
