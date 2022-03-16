/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.repository;

/**
 *
 * @author iapereira
 */
public class SqlRepositoryStrategy implements RepositoryStrategy{

    @Override
    public String matching(Query query) {
        String sql = "SELECT * FROM "+query.getTable()+" WHERE ";
        for (int i = 0; i < query.getVetCriteria().size(); i++) {
            Criteria criteria = query.getVetCriteria().get(i);
            sql+= criteria.getField() + " "+criteria.getOperator()+" "+criteria.getValue() +" AND ";
            
        }
       
        sql+="TRUE";
        return sql;
    }
    
}
