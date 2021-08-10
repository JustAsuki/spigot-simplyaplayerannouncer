package me.justasuki1.simplyplayerannouncer;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimplyPlayerAnnouncer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
