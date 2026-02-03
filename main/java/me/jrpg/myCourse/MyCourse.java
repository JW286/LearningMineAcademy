package me.jrpg.myCourse;

import org.bukkit.plugin.java.JavaPlugin;

public final class MyCourse extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}