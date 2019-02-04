/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.controller;

import com.arefin.entity.Insecticides;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class InsecticidesFacade extends AbstractFacade<Insecticides> {

    @PersistenceContext(unitName = "sunshinefarmPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InsecticidesFacade() {
        super(Insecticides.class);
    }
    
}
