/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.sql.SQLException;
import negocio.Usuario;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//        Usuario chumbinha = new Usuario();
//        chumbinha.setLogin("chumbinha");
//        chumbinha.setSenha("joelma");
//        chumbinha.save();
//        System.out.println("Que id o a chumbinha tem:"+chumbinha.getId());

        Usuario x = new Usuario();
        x.setId(1);
        x.delete();
    }

}
