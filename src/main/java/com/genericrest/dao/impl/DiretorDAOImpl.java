/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.DiretorDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Diretor;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hort_
 */
@ApplicationScoped
public class DiretorDAOImpl extends GenericDAO<Diretor, Long> implements DiretorDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(DiretorDAOImpl.class);

    public DiretorDAOImpl() {
        super(Diretor.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
