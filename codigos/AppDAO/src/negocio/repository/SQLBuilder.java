/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.repository;

/**
 *
 * @author iapereira
 */
public class SQLBuilder {
    private String sql;
    
    public SQLBuilder(){
        this.sql ="";
    }
    
    public SQLBuilder select(String table){
        this.sql+="select * from "+table+" WHERE ";
        return this;
    }
    
    public SQLBuilder equal(String parametro, Object valor){
        System.out.println(parametro);
        System.out.println(valor);
        this.sql+= parametro + " = " +valor + " AND ";
        return this;
        
    }
    
    public String toString(){
        return this.sql + " TRUE";
    }
    
}
