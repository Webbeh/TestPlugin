package dev.glassey;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {

    EventListener eventListener = new EventListener();

    @Override
    public void onDisable() {
        super.onDisable();
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getPluginManager().registerEvents(eventListener,this);
        Bukkit.getLogger().info("Ouiiii!!!");
    }
}
