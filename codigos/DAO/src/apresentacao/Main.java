/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.sql.SQLException;
import negocio.Usuario;
import persistencia.UsuarioDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//        Usuario frankaguiar = new Usuario();
//        frankaguiar.setLogin("Frank Aguiar");
//        frankaguiar.setSenha("auau");        
//         UsuarioDAO usuarioDAO = new UsuarioDAO();
//         usuarioDAO.save(frankaguiar);

         UsuarioDAO usuarioDAO = new UsuarioDAO();
         usuarioDAO.delete(3);

         
         
    }

}
