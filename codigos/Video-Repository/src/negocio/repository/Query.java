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
    private String tableName;
    private ArrayList<Criteria> criterias;

    public Query() {
        this.criterias = new ArrayList();
    }

    public ArrayList<Criteria> getCriterias() {
        return criterias;
    }

    public void setCriterias(ArrayList<Criteria> criterias) {
        this.criterias = criterias;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    
    
    
    
    
    
}
