/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.GeneroDAO;
import com.genericrest.model.Genero;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hort_
 */
@ApplicationScoped
public class GeneroDAOImpl extends GenericDAO<Genero, Long> implements GeneroDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(GeneroDAOImpl.class);

    public GeneroDAOImpl() {
        super(Genero.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
