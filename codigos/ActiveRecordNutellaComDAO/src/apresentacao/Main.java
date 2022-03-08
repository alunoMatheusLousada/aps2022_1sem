/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import negocio.Produto;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//
//        Produto p1 = new Produto();
//        p1.load(1);
//        p1.setNome("nutella generica");
//        p1.setValor(5000);
//             p3.delete();
//        p1.update();
//        System.out.println(p1.getNome());

        ArrayList<Produto> vetProduto = Produto.listar();
        for (int i = 0; i < vetProduto.size(); i++) {
            Produto p = vetProduto.get(i);
            System.out.println(p.toString());
            
        }
//        Scanner entrada = new Scanner(System.in);
////
//        System.out.println("Nome:");
//        String nome = entrada.nextLine();
////
//        System.out.println("Valor:");
//        double valor = entrada.nextDouble();
////
//        Produto produto = new Produto();
////        System.out.println("id:" + produto.getId());
////
//        produto.setNome(nome);
//        produto.setValor(valor);
////
//        produto.save();
//
//        System.out.println("id depois:" + produto.getId());
    }

}
