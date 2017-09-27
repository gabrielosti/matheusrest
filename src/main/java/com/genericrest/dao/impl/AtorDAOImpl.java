/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.AtorDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Ator;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hort_
 */
@ApplicationScoped
public class AtorDAOImpl extends GenericDAO<Ator, Long> implements AtorDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(AtorDAOImpl.class);

    public AtorDAOImpl() {
        super(Ator.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
