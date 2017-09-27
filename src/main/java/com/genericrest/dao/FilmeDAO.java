/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.model.Filme;
import java.util.List;

/**
 *
 * @author hort_
 */
public interface FilmeDAO extends DAO<Filme, Long>{
        
    List<Filme> findByNome(String nome);
    
}
