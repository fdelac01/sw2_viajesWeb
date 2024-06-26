/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Viajes;

/**
 *
 * @author julian
 */
@Stateless
public class ViajesFacade extends AbstractFacade<Viajes> implements ViajesFacadeLocal {

    @PersistenceContext(unitName = "ViajesWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViajesFacade() {
        super(Viajes.class);
    }
    
}
