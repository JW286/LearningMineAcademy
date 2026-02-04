package me.jrpg.myCourse;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

/*
* EntityListener is required for an EventHandler that involves entity interactions
*/

public class EntityListener implements Listener {

    /**
     * @param entity Represents the entity that you are interacting with
     */
    @EventHandler
    public void onEntityClick(PlayerInteractEntityEvent entity) {
        //Send Entity Name
        if (entity.getHand().equals(EquipmentSlot.OFF_HAND)){
            entity.getPlayer().sendMessage(entity.getRightClicked().getType().toString());
        }
        //Chicken
        if (entity.getRightClicked().getType() == EntityType.CHICKEN && entity.getHand().equals(EquipmentSlot.OFF_HAND)) {
            if (!entity.getRightClicked().isGlowing()) {
                entity.getRightClicked().setGlowing(true);
                entity.getPlayer().sendMessage("Glowing");
            }
            else {
                entity.getRightClicked().setGlowing(false);
                entity.getPlayer().sendMessage("Not Glowing");
            }
        }
    }
}