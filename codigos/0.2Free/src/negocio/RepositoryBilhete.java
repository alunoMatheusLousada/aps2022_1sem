/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import persistencia.BIlheteDAO;

/**
 *
 * @author iapereira
 */
public class RepositoryBilhete {
    private  BIlheteDAO bIlheteDAO;
    
    public RepositoryBilhete(){
        this.bIlheteDAO = new BIlheteDAO();
    }

    public boolean adicionar(Bilhete bilhete) {
        return this.bIlheteDAO.adicionar(bilhete);
    }
    
}
