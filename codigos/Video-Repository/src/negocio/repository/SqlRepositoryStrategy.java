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
public class SqlRepositoryStrategy implements RepositoryStrategy {

    @Override
    public String matching(Query q) {
        String sql = "SELECT * FROM "+q.getTableName()+" WHERE ";
        ArrayList<Criteria> criterias = q.getCriterias();
        for (int i = 0; i < criterias.size(); i++) {
            Criteria c = criterias.get(i);
            sql+= c.getField() + " "+ c.getOperator() + " "+c.getValue().toString()+" AND ";
            
        }
        sql +=" TRUE";
        return sql;
    }
    
}
