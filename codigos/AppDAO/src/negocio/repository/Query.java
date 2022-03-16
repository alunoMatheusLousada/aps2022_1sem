/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.repository;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Query {
    private ArrayList<Criteria> vetCriteria;
    private String table;
    
    public Query(){
        this.vetCriteria = new ArrayList();
    }

    public ArrayList<Criteria> getVetCriteria() {
        return vetCriteria;
    }

    public void setVetCriteria(ArrayList<Criteria> vetCriteria) {
        this.vetCriteria = vetCriteria;
    }

    public void setTable(String table) {
        this.table = table;
    }
    
    
    public String getTable(){
        return this.table;
    }
    
    
}
