/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import negocio.Pessoa;
import negocio.Telefone;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.registerObserver(new Pessoa("000.000.000-00", "Igor"));
        telefone.registerObserver(new Pessoa("111.111.111-11", "Chumbinha"));
        telefone.registerObserver(new Pessoa("222.222.222-22", "Joelma"));
        telefone.changeState("novo dvd da joelma...n deixe de comprar. está em promoção");

    }

}
