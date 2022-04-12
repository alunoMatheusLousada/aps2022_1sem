/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.DVD;
import negocio.Liquidacao;
import negocio.Regular;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.setNome("calipso");
        dvd.setDiretor("joelma");
        dvd.setSinopse("sem chimbinha");
        dvd.setPreco(200);
        dvd.setPromocao(new Regular());
        System.out.println("Preco regular:" + dvd.calcPreco());
        dvd.setPromocao(new Liquidacao());
        System.out.println("Preco em liquidação:" + dvd.calcPreco());

    }

}
