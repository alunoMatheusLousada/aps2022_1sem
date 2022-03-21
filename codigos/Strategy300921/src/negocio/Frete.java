/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.estrategias.CalculoDeFrete;
import negocio.estrategias.SEDEX;

/**
 *
 * @author iapereira
 */
public class Frete {   
    private CalculoDeFrete calculoDeFrete;
    
    public Frete(){
        this.calculoDeFrete = new SEDEX();
    }

    public CalculoDeFrete getCalculoDeFrete() {
        return calculoDeFrete;
    }
    public void setCalculoDeFrete(CalculoDeFrete calculoDeFrete) {
        this.calculoDeFrete = calculoDeFrete;
    }
           
    public double calcula(int distancia){
        return this.calculoDeFrete.calculaFrete(distancia);      
    }    
}