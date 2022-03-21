/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.estrategias;

/**
 *
 * @author iapereira
 */
public class SEDEX implements CalculoDeFrete{

    @Override
    public double calculaFrete(int distancia) {
         return distancia*0.8 + 120;
    }
    
}
