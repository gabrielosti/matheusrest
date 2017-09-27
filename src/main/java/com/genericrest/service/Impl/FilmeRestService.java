/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.Impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.FilmeDAO;
import com.genericrest.model.Filme;
import com.genericrest.service.FilmeService;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hort_
 */
@ManagedBean
@Path("/filme")
public class FilmeRestService extends GenericCRUDRestService<Filme> implements FilmeService{
    
    private static final Logger LOG = LoggerFactory.getLogger(FilmeRestService.class);
    
    @Inject
    private FilmeDAO filmeDAO;

    public FilmeRestService() {
        super(Filme.class);
    }    
    

    @Override
    public GenericEntity listToGenericEntity(List<Filme> list) {
        return new GenericEntity<List<Filme>>(list){};
    }

    @Override
    public DAO getDao() {
        return filmeDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    
    @GET
    @Path("/filme/{param}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Override
    public Response findByNome(@PathParam("param") String nome) {
        getLogger().debug("Search Filme object by nome: {}", nome);
        List<Filme> found = filmeDAO.findByNome(nome);
        if (found == null) {
            return Response.noContent().build();
        }
        return Response.ok().entity(found).build();        
    }
    
}
