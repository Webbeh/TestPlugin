package dev.glassey;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
    @Override
    public void onDisable() {
        super.onDisable();
        Bukkit.getLogger().info("Noooooonnn!!!");
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
        Bukkit.getLogger().info("Ouiiii!!!");
    }
}
