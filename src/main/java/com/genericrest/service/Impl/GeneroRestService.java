/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.GeneroDAO;
import com.genericrest.model.Genero;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.GeneroService;
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
@Path("/genero")
public class GeneroRestService extends GenericCRUDRestService<Genero> implements GeneroService{
    
    private static final Logger LOG = LoggerFactory.getLogger(GeneroRestService.class);
    
    @Inject
    private GeneroDAO generoDAO;
    
    public GeneroRestService() {
        super(Genero.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Genero> list) {
        return new GenericEntity<List<Genero>>(list){};
    }

    @Override
    public DAO getDao() {
        return generoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
    
}
