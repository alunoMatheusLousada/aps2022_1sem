/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.util.ArrayList;
import negocio.Pessoa;
import negocio.PessoaFisica;
import persistencia.ConexaoPostgreSQL;
import persistencia.PessoaFisicaDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        ConexaoPostgreSQL conexaoPostgreSQL = new ConexaoPostgreSQL();
//        conexaoPostgreSQL.getConexao();


//        PessoaFisica igorPereira = new PessoaFisica("Igor Avila Pereira", 1);

        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();        
        pessoaFisicaDAO.excluir(1);
        
        
        ArrayList<PessoaFisica> vet = pessoaFisicaDAO.listar();
        for (int i = 0; i < vet.size(); i++) {
            PessoaFisica p = vet.get(i);
            System.out.println("Nome:" + p.getNome());

        }

        // TODO code application logic here
//           PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
//           pessoaFisicaDAO.inserir(new PessoaFisica("Igor", "0000.0000-00"));
//
//            PessoaFisica p = new PessoaFisica("dsfsdfsd", "0k0k0k0k0");
////            p.inserir();
//        PessoaFisica p = new PessoaFisica("Igor", "0000.0000-00");
//        p.imprime();
    }

}
