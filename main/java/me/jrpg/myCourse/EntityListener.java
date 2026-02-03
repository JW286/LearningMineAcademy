package me.jrpg.myCourse;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

    /*
    * EntityListener is required for an EventHandler that involves entity interactions
    */

public class EntityListener implements Listener {
    /**
     *
     * @param event Represents the entity that you are interacting with
     */
    @EventHandler
    public void onMobRightClick(PlayerInteractEntityEvent event){
        if (event.getRightClicked().getType() == EntityType.CHICKEN)
            //If a player interacts with a chicken this will occur
            if (!event.getRightClicked().isGlowing())
                event.getRightClicked().setGlowing(true);
        if (event.getRightClicked().getType() == EntityType.COW)
            event.getRightClicked().setFireTicks(9999);
    }
}
