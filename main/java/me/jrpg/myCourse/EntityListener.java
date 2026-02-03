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
     * @param event Represents the entity that you are interacting with
     */
    @EventHandler
    public void onMobRightClick(PlayerInteractEntityEvent event) {
        if (event.getRightClicked().getType() == EntityType.CHICKEN && event.getHand().equals(EquipmentSlot.OFF_HAND)) {
            //If a player interacts with a chicken this will occur
            if (!event.getRightClicked().isGlowing()) {
                event.getRightClicked().setGlowing(true);
                event.getPlayer().sendMessage("Glowing");
            }
            else {
                event.getRightClicked().setGlowing(false);
                event.getPlayer().sendMessage("Not Glowing");
            }
        }
    }
}