/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Placa implements Subject {
    private ArrayList<Observer> vetCliente;
    private int caixaVaga;
    
    public Placa(){
        this.vetCliente = new ArrayList();
        this.caixaVaga = -1;
    }

    @Override
    public void addObserver(Observer observer) {
        this.vetCliente.add(observer);
    }

    @Override
    public void removeObserver(int i) {
        this.vetCliente.remove(i);
    }
    

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetCliente.size(); i++) {
            Observer cliente = vetCliente.get(i);
            cliente.update(this.caixaVaga);
//            this.caixaVaga = -1;
            
        }
    }   

    @Override
    public void removeObserver(Observer observer) {
        this.vetCliente.remove(observer);
    }

    public void setCaixaVaga(int caixaVaga) {
        this.caixaVaga = caixaVaga;
        this.notifyObservers();
    }
    
    
    
}
