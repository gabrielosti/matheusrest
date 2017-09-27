/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.AtorDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Ator;
import com.genericrest.service.AtorService;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hort_
 */
@ManagedBean
@Path("/ator")
public class AtorRestService extends GenericCRUDRestService<Ator> implements AtorService{
          
    private static final Logger LOG = LoggerFactory.getLogger(AtorRestService.class);
    
    @Inject
    private AtorDAO atorDAO;

    public AtorRestService() {
        super(Ator.class);
    }         
    
    @Override
    public GenericEntity listToGenericEntity(List<Ator> list) {
        return new GenericEntity<List<Ator>>(list){};
    }

    @Override
    public DAO getDao() {
        return atorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
    
    
}
