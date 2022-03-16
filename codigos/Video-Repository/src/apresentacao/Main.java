package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Pessoa;
import negocio.repository.RepositoryPessoa;
import persistencia.ConexaoPostgreSQL;
import persistencia.PessoaDAO;

/**
 *
 * @author iapereira
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

//         dao
//        new PessoaDAO().inserir(new Pessoa("555.555.555-55", "Cibele"));;

//repository

        RepositoryPessoa repositoryPessoa = new RepositoryPessoa();
        System.out.println(repositoryPessoa.recuperarPorCpf("111.111.111-11").getNome());
//        System.out.println("Nome:"+repositoryPessoa.recuperar(2).getNome());
//        repositoryPessoa.salvar(new Pessoa("111.111.111-11", "Igor"));

//        new PessoaDAO().atualizar(new Pessoa("111.111.111-11", "Rafael Betito"));

//        ArrayList<Pessoa> vetPessoa = repositoryPessoa.listar();               
//        for (int i = 0; i < vetPessoa.size(); i++) {
//            Pessoa p = vetPessoa.get(i);
//            System.out.println("id:"+p.getId()+":Nome:"+p.getNome()+"CPF:"+p.getCpf());
//            
//        }
    }
    
}
