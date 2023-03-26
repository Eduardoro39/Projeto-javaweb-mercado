/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mercadoonline.DAO;

import java.util.List;

/**
 *
 * @author Usuário
 */
public interface GenericDAO {
    
    public Boolean save(Object object);
    public List<Object> findAll();
    public void deleteById(Integer idObject);
    public Object findById(Integer idObject);
    public Boolean update(Object object);
    
}
