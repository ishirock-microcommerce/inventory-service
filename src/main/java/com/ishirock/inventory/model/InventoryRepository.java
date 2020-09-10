package com.ishirock.inventory.model;

import javax.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class InventoryRepository implements PanacheRepository<Inventory> {
    
    public Inventory findByItem(String item){
        return find("itemId", item).firstResult();
    }

}
