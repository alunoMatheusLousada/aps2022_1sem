/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(int i);    
    public void removeObserver(Observer observer);
    public void notifyObservers();
    
}
