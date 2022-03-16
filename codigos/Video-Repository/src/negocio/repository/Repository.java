/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.repository;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public interface Repository<T> {
    public void salvar(T t);
    public T recuperar(int id);
    public ArrayList<T> listar();
//    public void deletar(int id)
    
}
