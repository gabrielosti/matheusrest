/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.DiretorDAO;
import com.genericrest.model.Diretor;
import com.genericrest.service.DiretorService;
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
@Path("/diretor")
public class DiretorRestService extends GenericCRUDRestService<Diretor> implements DiretorService{

    public DiretorRestService() {
        super(Diretor.class);
    }
    
    private static final Logger LOG = LoggerFactory.getLogger(DiretorRestService.class);  
    
    @Inject
    private DiretorDAO diretorDAO;

    @Override
    public GenericEntity listToGenericEntity(List<Diretor> list) {
        return new GenericEntity<List<Diretor>>(list){};
    }

    @Override
    public DAO getDao() {
        return diretorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
}
