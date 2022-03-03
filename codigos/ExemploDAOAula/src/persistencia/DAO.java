/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import negocio.PessoaFisica;

/**
 *
 * @author iapereira
 */
public interface DAO<T> {
    
    public void inserir(T t) throws Exception;
    public ArrayList<T> listar() throws Exception;
    public void atualizar(T t) throws Exception;
    public void excluir(int id) throws Exception;


    
}
