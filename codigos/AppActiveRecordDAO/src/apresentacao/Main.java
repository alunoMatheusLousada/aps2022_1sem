package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Pessoa;
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
        Pessoa p = new Pessoa();
        p.setNome("Milene");
        p.setCpf("178.178.178-78");
        p.inserir();   
    }   
}