package com.ishirock.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.ishirock.inventory.model.Inventory;

@ApplicationScoped
public class InventoryService {
    @Inject
    EntityManager em; 

    @Transactional 
    public void addInventory(Inventory inventory) {
        em.persist(inventory);
    }

    public Inventory getInventory(String itemId){
        em.createQuery("SELECT * FROM Inventory where itemId = " + itemId);
        return null;
    }
}
