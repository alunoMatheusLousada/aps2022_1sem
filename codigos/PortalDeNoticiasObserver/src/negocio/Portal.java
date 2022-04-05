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
public class Portal implements Subject {
    private ArrayList<Observer> vetAssinante;
    private ArrayList<Noticia> vetNoticia;
    
    public Portal(){
        this.vetAssinante = new ArrayList();
        this.vetNoticia = new ArrayList();
    }

    @Override
    public void addObserver(Observer observer) {
        this.vetAssinante.add(observer);
    }

    @Override
    public void removeObserver(int i) {
        this.vetAssinante.remove(i);
    }
    
    public void addNoticia(Noticia noticia){
        this.vetNoticia.add(noticia);
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < vetAssinante.size(); i++) {
            Observer assinante = vetAssinante.get(i);
            if (this.vetNoticia.size() >= 1) {
                assinante.update(this.vetNoticia.get(this.vetNoticia.size()-1));
            }
        }
    }   

    @Override
    public void removeObserver(Observer observer) {
        this.vetAssinante.remove(observer);
    }
    
}
