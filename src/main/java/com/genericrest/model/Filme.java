/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hort_
 */
@Entity
@Table(name = "filmes")
@NamedQueries({
    @NamedQuery(name = "Filme.findByNome", query = "select p from Filme p where p.nome = :nome")
})
@XmlRootElement
public class Filme extends AbstractEntity {
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)    
    private Date dataLancamento;
    
    @Column(length = 255, nullable = false)
    private String enredo;
    
    @Column(length = 255, nullable = false)
    private String slogan;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Diretor diretor;  
    
    @OneToOne(cascade = CascadeType.ALL)
    private Produtora produtora;
    
    @OneToMany()
    private List<Ator> atores;
    
    @OneToMany
    private List<Genero> generos;

    public Filme() {
    }    

    @Override
    public void updateParameters(Object entity) {
        final Filme filme = (Filme) entity;
        
        this.dataLancamento = filme.getDataLancamento();
        this.diretor = filme.getDiretor();
        this.enredo = filme.getEnredo();
        this.nome = filme.getNome();
        this.slogan = filme.getSlogan();
        this.produtora = filme.getProdutora();
        this.generos = filme.getGeneros();
        this.atores = filme.getAtores();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filme other = (Filme) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getEnredo() {
        return enredo;
    }

    public void setEnredo(String enredo) {
        this.enredo = enredo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", dataLancamento=" + dataLancamento + ", enredo=" + enredo + ", slogan=" + slogan + ", diretor=" + diretor + '}';
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public void setProdutora(Produtora produtora) {
        this.produtora = produtora;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
    
}
