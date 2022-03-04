/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import persistencia.EmpregadoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Empregado;
import negocio.Projeto;
import persistencia.ConexaoPostgreSQL;
import persistencia.ProjetoDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Empregado empregado = new EmpregadoDAO().obter(2); // buscando betito
        Projeto projeto = new ProjetoDAO().obter(1); // buscando Projeto 1

//        a ideia eh remover o betito do projeto 1
        boolean resultado = new ProjetoDAO().removerEmpregado(projeto, empregado);
        ProjetoDAO projetoDAO = new ProjetoDAO();
        ArrayList<Projeto> vetProjeto = projetoDAO.listar();
        for (int i = 0; i < vetProjeto.size(); i++) {
            Projeto p = vetProjeto.get(i);
            System.out.println("-----------------");
            System.out.println("Nome do Projeto:" + p.getNome());
            ArrayList<Empregado> vetEmpregado = p.getVetFuncionario();
            for (int j = 0; j < vetEmpregado.size(); j++) {
                Empregado e = vetEmpregado.get(j);
                System.out.println("Nome:" + e.getNome());

            }
            System.out.println("-----------------");
        }
    }

}
