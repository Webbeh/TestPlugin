package dev.glassey;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Noooooonnn!!!");
        super.onDisable();
    }
    
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Ouiiii!!!");
        super.onEnable();
    }
}
