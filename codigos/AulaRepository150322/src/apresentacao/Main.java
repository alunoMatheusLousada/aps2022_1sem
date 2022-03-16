package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Pessoa;
import negocio.repository.JsonRepositoryStrategy;
import negocio.repository.PessoaRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import persistencia.ConexaoPostgreSQL;
import persistencia.Json;
import persistencia.PessoaDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, JSONException {

//        new PessoaDAO().inserir(new Pessoa("111.111.111-11", "Igor"));
        PessoaRepository pessoaRepository = new PessoaRepository();

        System.out.println(pessoaRepository.pesquisarPorCpf("'666.666.666-66'").getNome());
//            pessoaRepository.create(new Pessoa("666.666.666-66", "Marcio"));

//        new PessoaDAO().atualizar(new Pessoa("111.111.111-11", "Rafael Betito"));
//        ArrayList<Pessoa> vetPessoa = new PessoaDAO().listar();               
//        for (int i = 0; i < vetPessoa.size(); i++) {
//            Pessoa p = vetPessoa.get(i);
//            System.out.println("Nome:"+p.getNome());
//            
//        }


//            pessoaRepository.setStrategy(new JsonRepositoryStrategy());
//            System.out.println(pessoaRepository.pesquisarPorCpf("000.000.000-00").getNome());
    
//        Json json = new Json();
//        System.out.println(json.getArray().toString());
    }

}
