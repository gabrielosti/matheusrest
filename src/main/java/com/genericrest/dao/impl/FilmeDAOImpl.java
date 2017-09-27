/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.FilmeDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Filme;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class FilmeDAOImpl extends GenericDAO<Filme, Long> implements FilmeDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(FilmeDAOImpl.class);    

    public FilmeDAOImpl() {
        super(Filme.class);
    }

    @Override
    public List<Filme> findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Filme.findByNome", Filme.class);
        query.setParameter("nome", nome);

        List<Filme> filmes = query.getResultList();
        if (filmes == null || filmes.isEmpty()) {
            return null;
        } else {
            return filmes;
        }       
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
