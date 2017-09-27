/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ProdutoraDAO;
import com.genericrest.model.Produtora;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ProdutoraService;
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
@Path("/produtora")
public class ProdutoraRestService extends GenericCRUDRestService<Produtora> implements ProdutoraService{
    
    private static final Logger LOG = LoggerFactory.getLogger(ProdutoraRestService.class);
    
    @Inject
    private ProdutoraDAO produtoraDAO;

    public ProdutoraRestService() {
        super(Produtora.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Produtora> list) {
        return new GenericEntity<List<Produtora>>(list){};
    }

    @Override
    public DAO getDao() {
        return produtoraDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
