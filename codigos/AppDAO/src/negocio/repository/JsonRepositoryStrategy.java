/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.repository;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import persistencia.Json;

/**
 *
 * @author iapereira
 */
public class JsonRepositoryStrategy implements RepositoryStrategy{
    private Json json;
    
    public JsonRepositoryStrategy() throws JSONException{
        this.json = new Json();
        
    }

    @Override
    public String matching(Query query) {
        Criteria criteria = query.getVetCriteria().get(0);
        
        System.out.println("cheguei!!");
        
        String campo = criteria.getField();
        String valor = criteria.getValue().toString();       
        
        try {
            JSONObject jsonObj = this.json.getArray().getJSONObject(0);
            System.out.println(jsonObj.getString(campo));
            if (jsonObj.getString(campo).equals(valor)){
                System.out.println("funfou...");
                return jsonObj.getString("nome");
            }
        } catch (JSONException ex) {
            Logger.getLogger(JsonRepositoryStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
        

    }
    
}
