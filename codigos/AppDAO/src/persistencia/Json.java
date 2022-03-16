/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import negocio.Pessoa;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author iapereira
 */
public class Json {

    private JSONArray array;

    public Json() throws JSONException {
        this.array = new JSONArray();

        JSONObject jsonObj = new JSONObject();

        jsonObj.put("id", 1);
        jsonObj.put("nome", "jose");
        jsonObj.put("cpf", "000.000.000-00");

        array.put(jsonObj);

        jsonObj = new JSONObject();
        jsonObj.put("id", 2);
        jsonObj.put("nome", "patricio");
        jsonObj.put("cpf", "888.888.888-88");
                array.put(jsonObj);


    }

    public void save(Pessoa p) throws JSONException {
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("id", p.getId());
        jsonObj.put("nome", p.getNome());

        array.put(jsonObj);

//        json.put("course", array);
//        System.out.println(array.toString());
    }

    public JSONArray getArray() {
        return array;
    }

    public void setArray(JSONArray array) {
        this.array = array;
    }

}
