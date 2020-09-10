package com.ishirock.inventory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ishirock.inventory.model.Inventory;
import com.ishirock.inventory.model.InventoryRepository;

@Path("/inventory")
public class InventoryResource {

    @Inject InventoryRepository inventoryRepository;

    @GET
    @Path("/{itemId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Inventory getInventory(@PathParam("itemId") String itemId) {
        return inventoryRepository.findByItem(itemId);
    }
}