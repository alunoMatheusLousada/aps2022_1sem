/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.repository;

import java.sql.SQLException;
import negocio.Pessoa;
import persistencia.PessoaDAO;

/**
 *
 * @author iapereira
 */
public class PessoaRepository {

    private RepositoryStrategy strategy;
    private PessoaDAO pessoaDAO;

    public PessoaRepository() {
        this.pessoaDAO = new PessoaDAO();
        this.strategy = new SqlRepositoryStrategy();
    }

    public RepositoryStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RepositoryStrategy strategy) {
        this.strategy = strategy;
    }

    public void create(Pessoa pessoa) throws SQLException {
        this.pessoaDAO.inserir(pessoa);
    }

    public Pessoa pesquisarPorCpf(String cpf) throws SQLException {
//        Query query = new Query();
//        query.setTable("pessoa");
//        Criteria criteria = new Criteria();
//        criteria.setField("cpf");
//        criteria.setValue(cpf);
//        criteria.setOperator(Operator.EQUAL.toString());
//        query.getVetCriteria().add(criteria);

        String query = new SQLBuilder().select("pessoa").equal("cpf", cpf).toString();

//        System.out.println(query);
//        System.exit(0);
//        System.out.println(this.strategy.matching(query));
//        System.exit(0);
//        return null;
        return this.pessoaDAO.executeSQL(query);

    }

}
