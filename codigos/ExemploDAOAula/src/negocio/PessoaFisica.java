/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    
    public PessoaFisica(String nome, String cpf){
        try {
            super.nome = nome;
            this.setCpf(cpf);
        } catch (Exception ex) {
            Logger.getLogger(PessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public double vencimento() {
        return 1000;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
//        if (new Random().nextInt(2) == 1){
//            throw new Exception("deu xabum!!! cpf invalido por sorteio que fiz agora!!");
//        } else  {
            this.cpf = cpf;
//        }
    }
    
    
    public void imprime(){
        super.imprime();
        System.out.println("CPf:"+this.cpf);
    }
    
    
    
}
