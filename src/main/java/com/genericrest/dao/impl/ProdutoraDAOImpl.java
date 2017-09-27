/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ProdutoraDAO;
import com.genericrest.model.Produtora;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hort_
 */
@ApplicationScoped
public class ProdutoraDAOImpl extends GenericDAO<Produtora, Long> implements ProdutoraDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(ProdutoraDAOImpl.class);

    public ProdutoraDAOImpl() {
        super(Produtora.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;        
    }
    
}
