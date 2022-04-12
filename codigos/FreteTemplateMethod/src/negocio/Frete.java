/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public abstract class Frete {
    protected double desconto;
            
    public final double calcFrete(double peso){
        double valor = this.modalidade();
        valor = valor + this.getFreteDevidoAoPeso(peso);
        valor = valor + this.getFreteDevidoAoDesconto();
        return valor;
    }
    
    protected abstract double modalidade();
    
    protected double getFreteDevidoAoPeso(double peso){
        double x = 0.7;
        return peso*x;
    }
    
    protected double getFreteDevidoAoDesconto(){
        return this.desconto;
    }

   
    
    
}
