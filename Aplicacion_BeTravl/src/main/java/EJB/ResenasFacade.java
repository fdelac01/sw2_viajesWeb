/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Resenas;

/**
 *
 * @author julian
 */
@Stateless
public class ResenasFacade extends AbstractFacade<Resenas> implements ResenasFacadeLocal {

    @PersistenceContext(unitName = "ViajesWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResenasFacade() {
        super(Resenas.class);
    }
    
}
